// Java_libxray_Libxray_measureOutboundDelayWithType @ 01c6f1cc size=244
// callers:
//   Entry Point ?

undefined8
Java_libxray_Libxray_measureOutboundDelayWithType
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5,undefined8 param_6)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  
  auVar3 = go_seq_from_java_string(param_1,param_3);
  auVar4 = go_seq_from_java_string(param_1,param_4);
  auVar5 = go_seq_from_java_string(param_1,param_5);
  auVar6 = go_seq_from_java_string(param_1,param_6);
  auVar3 = proxylibxray__MeasureOutboundDelayWithType
                     (auVar3._0_8_,auVar3._8_8_,auVar4._0_8_,auVar4._8_8_,auVar5._0_8_,auVar5._8_8_,
                      auVar6._0_8_,auVar6._8_8_);
  uVar2 = auVar3._0_8_;
  uVar1 = go_seq_from_refnum(param_1,auVar3._8_8_,proxy_class__error,proxy_class__error_cons);
  go_seq_maybe_throw_exception(param_1,uVar1);
  return uVar2;
}


