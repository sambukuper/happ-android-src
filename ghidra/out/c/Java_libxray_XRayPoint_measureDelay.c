// Java_libxray_XRayPoint_measureDelay @ 01c6f58c size=176
// callers:
//   Entry Point ?

undefined8
Java_libxray_XRayPoint_measureDelay
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  
  uVar1 = go_seq_to_refnum_go();
  uVar1 = uVar1 & 0xffffffff;
  auVar4 = go_seq_from_java_string(param_1,param_3);
  auVar5 = go_seq_from_java_string(param_1,param_4);
  auVar4 = proxylibxray_XRayPoint_MeasureDelay
                     (uVar1 & 0xffffffff,auVar4._0_8_,auVar4._8_8_,auVar5._0_8_,auVar5._8_8_,param_5
                     );
  uVar3 = auVar4._0_8_;
  uVar2 = go_seq_from_refnum(param_1,auVar4._8_8_,proxy_class__error,proxy_class__error_cons);
  go_seq_maybe_throw_exception(param_1,uVar2);
  return uVar3;
}


