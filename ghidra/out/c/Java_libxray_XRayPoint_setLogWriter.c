// Java_libxray_XRayPoint_setLogWriter @ 01c6f99c size=68
// callers:
//   Entry Point ?

void Java_libxray_XRayPoint_setLogWriter(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  undefined1 local_20 [32];
  
  uVar1 = go_seq_to_refnum_go();
  uVar2 = go_seq_to_refnum(param_1,param_3);
  puVar4 = local_20;
  uVar3 = _cgo_wait_runtime_init_done();
  *(undefined4 *)(puVar4 + 0x18) = uVar1;
  *(undefined4 *)(puVar4 + 0x1c) = uVar2;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_LogWriter_Set,puVar4 + 0x18,8,uVar3);
  _cgo_release_context(uVar3);
  return;
}


