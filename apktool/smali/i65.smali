.class public final Li65;
.super Lzh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic Z:B


# direct methods
.method public synthetic constructor <init>(Laa7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Li65;->Z:B

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lzh1;-><init>(Laa7;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final o0()Z
    .locals 0

    .line 1
    iget-byte p0, p0, Li65;->Z:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :pswitch_0
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final y0(Laa7;)Lyh1;
    .locals 1

    .line 1
    iget-byte p0, p0, Li65;->Z:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Li65;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, p1, v0}, Li65;-><init>(Laa7;B)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    new-instance p0, Li65;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, v0}, Li65;-><init>(Laa7;B)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
