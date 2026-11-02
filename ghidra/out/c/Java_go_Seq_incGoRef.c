// Java_go_Seq_incGoRef @ 01c7096c size=8
// callers:
//   Entry Point ?

void Java_go_Seq_incGoRef(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  undefined8 uVar1;
  undefined1 *puVar2;
  undefined1 auStack_20 [32];
  
  puVar2 = auStack_20;
  uVar1 = _cgo_wait_runtime_init_done();
  *(undefined4 *)(puVar2 + -4) = param_3;
  crosscall2(_cgoexp_5994d4b84130_IncGoRef,puVar2 + -4,4,uVar1);
  _cgo_release_context(uVar1);
  return;
}


