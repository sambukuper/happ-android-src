// proxylibxray__DisableWrapperLogs @ 01c6e5cc size=68
// callers:
//   Entry Point ?
//   01c6eff4 Java_libxray_Libxray_disableWrapperLogs

void proxylibxray__DisableWrapperLogs(void)

{
  undefined8 uVar1;
  undefined1 *puVar2;
  undefined1 local_20 [32];
  
  puVar2 = local_20;
  uVar1 = _cgo_wait_runtime_init_done();
  puVar2[0x1c] = 0;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__DisableWrapperLogs,puVar2 + 0x1c,0,uVar1);
  _cgo_release_context(uVar1);
  return;
}


