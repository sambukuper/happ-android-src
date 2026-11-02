// Java_libxray_Libxray_disableWrapperLogs @ 01c6eff4 size=4
// callers:
//   Entry Point ?

void Java_libxray_Libxray_disableWrapperLogs(void)

{
  undefined8 uVar1;
  undefined1 *puVar2;
  undefined1 auStack_20 [32];
  
  puVar2 = auStack_20;
  uVar1 = _cgo_wait_runtime_init_done();
  puVar2[0x1c] = 0;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__DisableWrapperLogs,puVar2 + 0x1c,0,uVar1);
  _cgo_release_context(uVar1);
  return;
}


