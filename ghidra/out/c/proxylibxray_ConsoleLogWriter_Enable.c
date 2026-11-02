// proxylibxray_ConsoleLogWriter_Enable @ 01c6db3c size=80
// callers:
//   Entry Point ?
//   01c6f388 Java_libxray_ConsoleLogWriter_enable

void proxylibxray_ConsoleLogWriter_Enable(undefined4 param_1)

{
  undefined8 uVar1;
  undefined1 *puVar2;
  undefined1 local_20 [32];
  
  puVar2 = local_20;
  uVar1 = _cgo_wait_runtime_init_done();
  *(undefined4 *)(puVar2 + -4) = param_1;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_ConsoleLogWriter_Enable,puVar2 + -4,4,uVar1);
  _cgo_release_context(uVar1);
  return;
}


