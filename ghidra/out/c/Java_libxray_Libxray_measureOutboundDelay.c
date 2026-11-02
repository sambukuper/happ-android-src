// Java_libxray_Libxray_measureOutboundDelay @ 01c6f130 size=156
// callers:
//   Entry Point ?

undefined8
Java_libxray_Libxray_measureOutboundDelay
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  
  auVar3 = go_seq_from_java_string(param_1,param_3);
  auVar4 = go_seq_from_java_string(param_1,param_4);
  auVar3 = proxylibxray__MeasureOutboundDelay
                     (auVar3._0_8_,auVar3._8_8_,auVar4._0_8_,auVar4._8_8_,param_5);
  uVar2 = auVar3._0_8_;
  uVar1 = go_seq_from_refnum(param_1,auVar3._8_8_,proxy_class__error,proxy_class__error_cons);
  go_seq_maybe_throw_exception(param_1,uVar1);
  return uVar2;
}


