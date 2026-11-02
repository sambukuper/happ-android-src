.class public final synthetic Lv42;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lv42;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lv42;->Y:Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

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
    .locals 4

    .line 1
    iget-byte v0, p0, Lv42;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lv42;->Y:Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 9
    .line 10
    new-instance v0, Lj52;

    .line 11
    .line 12
    iget-object v1, p0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->S0:Lvz7;

    .line 13
    .line 14
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lw42;

    .line 19
    .line 20
    new-instance v2, Lb1;

    .line 21
    .line 22
    const/16 v3, 0x8

    .line 23
    .line 24
    invoke-direct {v2, p0, v3}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Lj52;-><init>(Lw42;Lb1;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    iget-object p0, p0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->Q0:Lv5;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    new-instance v0, Lw42;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lw42;-><init>(Lv5;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    const-string p0, "binding"

    .line 42
    .line 43
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
