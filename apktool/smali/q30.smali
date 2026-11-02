.class public final synthetic Lq30;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lq30;->X:B

    .line 2
    .line 3
    iput-boolean p1, p0, Lq30;->Y:Z

    .line 4
    .line 5
    iput-object p2, p0, Lq30;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lq30;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lq30;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iget-boolean p0, p0, Lq30;->Y:Z

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 13
    .line 14
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    invoke-static {v2}, Li21;->H(Ld94;)Lu84;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v0, Ltp1;->a:Lnf1;

    .line 23
    .line 24
    sget-object v0, Ldm4;->a:Lhv2;

    .line 25
    .line 26
    new-instance v3, Lnk4;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-direct {v3, v2, v4, v5}, Lnk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-static {p0, v0, v3, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v1

    .line 38
    :pswitch_0
    check-cast v2, Ldn2;

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    return-object v1

    .line 46
    :pswitch_1
    check-cast v2, Lw05;

    .line 47
    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    invoke-interface {v2, v1}, Lw05;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
