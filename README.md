# react-native-immediate-quickzap

Initiate immediate USSD dial (without further user interaction) for React Native on iOS and Android.

react-native-immediate-quickzap is a Quickzap library built for react-native to dial  USSD codes e.g *123#



## Setup

Fast and easy:

Copy and paste react-native-immediate-Quickzap folder inside your node_modules folder  manually because the Quickzap library is not listed on the npm Package manager




 manual:  add the latest version as dependeny to your package.json.

```javascript
{
  "name": "YourProject",
  ...
  },
  "dependencies": {
    ...
    "react-native-immediate-quickzap": "1.0.0",
    ...
  }
```
Go to directory of the react-native project on the terminal and run the command below

```bash

react-native link react-native-immediate-phone-quickzap
```



#### Android
* In the AndroidManifest.xml file of your android studio project add:
    ```
    <uses-permission android:name="android.permission.CALL_PHONE" />
    ```

## Usage



```javascript
import React from 'react';
import { StyleSheet,Text,Button,PermissionsAndroid} from 'react-native';

import RNImmediateQuickzap  from 'react-native-immediate-quickzap';

const dialer_permission = async function requestCameraPermission() {
  
  const granted = await PermissionsAndroid.request(
    PermissionsAndroid.PERMISSIONS.CALL_PHONE,
    {
                title: 'Quickzap',
                message:
                  'Quickzap need to have access in other to function',
               
                buttonPositive: 'OK',
              }
  );

} 
dialer_permission();

const onSubmit=() =>{

RNImmediateQuickzap.immediateQuickzap('*894*00#');
}
const firstscreen = () => {
return (
    <>
    <Text style={{fontSize:48}}>Click the Action button</Text>

<Button title="Action" onPress={() => onSubmit()} />
</>
)
};


const styles = StyleSheet.create({});

export default firstscreen;
...
```
