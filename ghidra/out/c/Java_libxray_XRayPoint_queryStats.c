// Java_libxray_XRayPoint_queryStats @ 01c6f63c size=112
// callers:
//   Entry Point ?

undefined8
Java_libxray_XRayPoint_queryStats
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  dword dVar1;
  undefined8 uVar2;
  undefined8 in_x21;
  undefined8 in_x24;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  uint uStack_50;
  undefined1 auStack_48 [16];
  undefined1 auStack_38 [16];
  undefined8 uStack_28;
  undefined8 local_18;
  undefined8 local_10;
  
  local_18 = in_x21;
  dVar1 = go_seq_to_refnum_go();
  auVar3 = go_seq_from_java_string(param_1,param_3);
  auVar4 = go_seq_from_java_string(param_1,param_4);
  local_10 = local_18;
  local_18 = in_x24;
  uVar2 = _cgo_wait_runtime_init_done();
  uStack_28 = 0;
  uStack_50 = (uint)dVar1;
  auStack_38 = auVar4;
  auStack_48 = auVar3;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStats,&uStack_50,0x30,uVar2);
  _cgo_release_context(uVar2);
  return local_18;
}


