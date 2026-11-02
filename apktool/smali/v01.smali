.class public final synthetic Lv01;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lmf5;


# direct methods
.method public synthetic constructor <init>(Lmf5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lv01;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lv01;->Y:Lmf5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lv01;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lv01;->Y:Lmf5;

    .line 4
    .line 5
    check-cast p1, Lkl5;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lmf5;->getPointerIconService()Lgq5;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-interface {p0}, Lmf5;->getTextToolbar()Lq88;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_1
    invoke-interface {p0}, Lmf5;->getSoftwareKeyboardController()Lbe7;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_2
    invoke-interface {p0}, Lmf5;->getTextInputService()Lo78;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_3
    invoke-interface {p0}, Lmf5;->getInputModeManager()Lyd3;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
