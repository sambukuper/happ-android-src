// Java_libxray_XRayPoint_queryStatsCustom @ 01c6f6ac size=152
// callers:
//   Entry Point ?

undefined8
Java_libxray_XRayPoint_queryStatsCustom
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5)

{
  dword dVar1;
  undefined8 uVar2;
  undefined8 in_x22;
  undefined8 in_x26;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  uint uStack_68;
  undefined1 auStack_60 [16];
  undefined1 local_50 [16];
  undefined1 local_40 [16];
  undefined8 local_30;
  undefined8 local_20;
  undefined8 uStack_18;
  
  local_20 = in_x22;
  dVar1 = go_seq_to_refnum_go();
  auVar3 = go_seq_from_java_string(param_1,param_3);
  auVar4 = go_seq_from_java_string(param_1,param_4);
  auVar5 = go_seq_from_java_string(param_1,param_5);
  uStack_18 = local_20;
  local_20 = in_x26;
  uVar2 = _cgo_wait_runtime_init_done();
  local_30 = 0;
  uStack_68 = (uint)dVar1;
  local_40 = auVar5;
  local_50 = auVar4;
  auStack_60 = auVar3;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsCustom,&uStack_68,0x40,uVar2);
  _cgo_release_context(uVar2);
  return local_20;
}


