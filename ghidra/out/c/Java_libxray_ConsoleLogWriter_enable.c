// Java_libxray_ConsoleLogWriter_enable @ 01c6f378 size=20
// callers:
//   Entry Point ?

void Java_libxray_ConsoleLogWriter_enable(void)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 in_x30;
  undefined8 auStack_18 [2];
  undefined8 uStack_8;
  
  uStack_8 = in_x30;
  uVar1 = go_seq_to_refnum_go();
  auStack_18[0] = uStack_8;
  puVar3 = auStack_18;
  uVar2 = _cgo_wait_runtime_init_done();
  *(undefined4 *)((int)puVar3 + -4) = uVar1;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_ConsoleLogWriter_Enable,(int)puVar3 + -4,4,uVar2);
  _cgo_release_context(uVar2);
  return;
}


