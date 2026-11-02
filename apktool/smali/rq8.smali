.class public final synthetic Lrq8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lwq8;


# direct methods
.method public synthetic constructor <init>(Lwq8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lrq8;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrq8;->Y:Lwq8;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lrq8;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lrq8;->Y:Lwq8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lwq8;->b:Lv06;

    .line 9
    .line 10
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lbr8;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    iget-object p0, p0, Lwq8;->d:Lv06;

    .line 18
    .line 19
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lor8;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    iget-object p0, p0, Lwq8;->a:Lv06;

    .line 27
    .line 28
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Len0;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
