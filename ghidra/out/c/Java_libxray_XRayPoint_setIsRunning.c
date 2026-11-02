// Java_libxray_XRayPoint_setIsRunning @ 01c6f958 size=36
// callers:
//   Entry Point ?

void Java_libxray_XRayPoint_setIsRunning(undefined8 param_1,undefined8 param_2,undefined1 param_3)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 in_x19;
  undefined8 *puVar3;
  undefined8 in_x30;
  undefined8 uStack_28;
  undefined8 local_20;
  undefined8 uStack_18;
  undefined8 local_10;
  
  uStack_18 = in_x30;
  local_10 = in_x19;
  uVar1 = go_seq_to_refnum_go();
  puVar3 = &uStack_28;
  uStack_28 = uStack_18;
  local_20 = local_10;
  uVar2 = _cgo_wait_runtime_init_done();
  *(undefined8 *)((int)puVar3 + 0x18) = 0;
  *(undefined4 *)((int)puVar3 + 0x18) = uVar1;
  *(undefined1 *)((int)puVar3 + 0x1c) = param_3;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_IsRunning_Set,
             (undefined1 *)((int)puVar3 + 0x18),5,uVar2);
  _cgo_release_context(uVar2);
  return;
}


