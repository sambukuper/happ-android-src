// proxylibxray_XRayPoint_IsRunning_Set @ 01c6dcf0 size=92
// callers:
//   Entry Point ?
//   01c6f978 Java_libxray_XRayPoint_setIsRunning

void proxylibxray_XRayPoint_IsRunning_Set(undefined4 param_1,undefined1 param_2)

{
  undefined8 uVar1;
  undefined1 *puVar2;
  undefined1 local_30 [48];
  
  puVar2 = local_30;
  uVar1 = _cgo_wait_runtime_init_done();
  *(undefined8 *)(puVar2 + 0x18) = 0;
  *(undefined4 *)(puVar2 + 0x18) = param_1;
  puVar2[0x1c] = param_2;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_IsRunning_Set,puVar2 + 0x18,5,uVar1);
  _cgo_release_context(uVar1);
  return;
}


