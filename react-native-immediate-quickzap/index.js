import {NativeModules} from 'react-native';

var RNImmediateQuickzap = {
  immediateQuickzap: function(number) {
        NativeModules.RNImmediateQuickzap.immediateQuickzap(number);
  }
};

export default RNImmediateQuickzap;
