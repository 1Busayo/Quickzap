#import <UIKit/UIKit.h>
#import "React/RCTBridgeModule.h"


@interface RNImmediateQuickzap : NSObject <RCTBridgeModule>
@end

@implementation RNImmediateQuickzap

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(immediateQuickzap:(NSString *)number)
{
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:[NSString stringWithFormat:@"tel:%@", number]]];
};

@end
