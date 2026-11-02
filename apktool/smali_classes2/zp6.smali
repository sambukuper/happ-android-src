.class public final synthetic Lzp6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lzp6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lzp6;->Y:Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;

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
    .locals 12

    .line 1
    iget-byte v0, p0, Lzp6;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;->U0:I

    .line 7
    .line 8
    new-instance v0, Llr2;

    .line 9
    .line 10
    iget-object v3, p0, Lzp6;->Y:Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;

    .line 11
    .line 12
    iget-object p0, v3, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;->S0:Lvz7;

    .line 13
    .line 14
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Laq6;

    .line 19
    .line 20
    new-instance v1, Lal5;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    const/16 v8, 0x8

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    const-class v4, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;

    .line 27
    .line 28
    const-string v5, "onClick"

    .line 29
    .line 30
    const-string v6, "onClick(Ljava/lang/String;)V"

    .line 31
    .line 32
    invoke-direct/range {v1 .. v8}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Lkn7;

    .line 36
    .line 37
    invoke-virtual {v3}, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;->A()Leq6;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v11, 0x1

    .line 43
    const/4 v5, 0x0

    .line 44
    const-class v7, Leq6;

    .line 45
    .line 46
    const-string v8, "getFilterGeoFileSearchCache"

    .line 47
    .line 48
    const-string v9, "getFilterGeoFileSearchCache()Ljava/util/List;"

    .line 49
    .line 50
    invoke-direct/range {v4 .. v11}, Lkn7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, p0, v1, v4}, Llr2;-><init>(Laq6;Lal5;Lkn7;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    iget-object p0, p0, Lzp6;->Y:Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;

    .line 58
    .line 59
    iget-object p0, p0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;->Q0:Lz47;

    .line 60
    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    new-instance v0, Laq6;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Laq6;-><init>(Lz47;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_0
    const-string p0, "binding"

    .line 70
    .line 71
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    throw p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
