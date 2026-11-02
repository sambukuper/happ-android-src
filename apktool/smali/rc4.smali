.class public final synthetic Lrc4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lf63;


# direct methods
.method public synthetic constructor <init>(Lf63;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lrc4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrc4;->Y:Lf63;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lrc4;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lrc4;->Y:Lf63;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lbk0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lyz4;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lqc4;->i(Lv85;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lbk0;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Lbk0;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lbk0;-><init>(Lf63;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_1
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lyz4;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lqc4;->f(Lv85;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
