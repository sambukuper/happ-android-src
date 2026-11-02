// Java_libxray_XRayPoint_queryStatsServer @ 01c6f744 size=164
// callers:
//   Entry Point ?

undefined8
Java_libxray_XRayPoint_queryStatsServer(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 in_x29;
  undefined8 in_x30;
  undefined1 auVar4 [16];
  undefined4 local_18;
  
  uVar1 = go_seq_to_refnum_go();
  uVar1 = uVar1 & 0xffffffff;
  auVar4 = go_seq_from_java_string(param_1,param_3);
  proxylibxray_XRayPoint_QueryStatsServer(uVar1 & 0xffffffff,auVar4._0_8_,auVar4._8_8_);
  uVar2 = go_seq_to_java_string(param_1,in_x29,in_x30);
  uVar3 = go_seq_from_refnum(param_1,local_18,proxy_class__error,proxy_class__error_cons);
  go_seq_maybe_throw_exception(param_1,uVar3);
  return uVar2;
}


