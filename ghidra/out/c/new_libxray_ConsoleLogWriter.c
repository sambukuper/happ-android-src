// new_libxray_ConsoleLogWriter @ 01c6dbfc size=72
// callers:
//   Entry Point ?
//   01c6f310 Java_libxray_ConsoleLogWriter__1_1New

undefined4 new_libxray_ConsoleLogWriter(void)

{
  undefined8 uVar1;
  undefined1 *puVar2;
  undefined1 local_20 [32];
  
  puVar2 = local_20;
  uVar1 = _cgo_wait_runtime_init_done();
  *(undefined4 *)(puVar2 + 0x1c) = 0;
  crosscall2(_cgoexp_5994d4b84130_new_libxray_ConsoleLogWriter,puVar2 + 0x1c,4,uVar1);
  _cgo_release_context(uVar1);
  return *(undefined4 *)(puVar2 + 0x1c);
}


