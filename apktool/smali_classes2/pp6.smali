.class public final Lpp6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

.field public final synthetic j0:Ljava/lang/String;

.field public final synthetic k0:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Ljava/lang/String;Ljava/lang/String;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lpp6;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lpp6;->i0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 4
    .line 5
    iput-object p2, p0, Lpp6;->j0:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lpp6;->k0:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lpp6;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lpp6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lpp6;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lpp6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lpp6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lpp6;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lpp6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 7

    .line 1
    iget-byte p2, p0, Lpp6;->g0:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpp6;

    .line 7
    .line 8
    iget-object v3, p0, Lpp6;->k0:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, Lpp6;->i0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 12
    .line 13
    iget-object v2, p0, Lpp6;->j0:Ljava/lang/String;

    .line 14
    .line 15
    move-object v4, p1

    .line 16
    invoke-direct/range {v0 .. v5}, Lpp6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Ljava/lang/String;Ljava/lang/String;Lq51;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p1

    .line 21
    new-instance v1, Lpp6;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, Lpp6;->k0:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, Lpp6;->i0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 28
    .line 29
    iget-object v3, p0, Lpp6;->j0:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, Lpp6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Ljava/lang/String;Ljava/lang/String;Lq51;B)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Lpp6;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lc71;->X:Lc71;

    .line 11
    .line 12
    iget-boolean v4, p0, Lpp6;->h0:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lpp6;->i0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 30
    .line 31
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->C()Lmn6;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v5, p0, Lpp6;->j0:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v6, p0, Lpp6;->k0:Ljava/lang/String;

    .line 38
    .line 39
    sget-object v7, Lmr2;->Y:Lmr2;

    .line 40
    .line 41
    iget-object p1, p0, Lpp6;->i0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 42
    .line 43
    iget-boolean v8, p1, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->U0:Z

    .line 44
    .line 45
    iput-boolean v3, p0, Lpp6;->h0:Z

    .line 46
    .line 47
    sget-object p1, Lmn6;->j:Lvz7;

    .line 48
    .line 49
    move-object v9, p0

    .line 50
    invoke-virtual/range {v4 .. v9}, Lmn6;->C(Ljava/lang/String;Ljava/lang/String;Lmr2;ZLs51;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v0, :cond_2

    .line 55
    .line 56
    move-object v1, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    sget-object v1, Ldn8;->a:Ldn8;

    .line 59
    .line 60
    :goto_1
    return-object v1

    .line 61
    :pswitch_0
    move-object v7, p0

    .line 62
    sget-object p0, Lc71;->X:Lc71;

    .line 63
    .line 64
    iget-boolean v0, v7, Lpp6;->h0:Z

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    if-ne v0, v3, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, v7, Lpp6;->i0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 82
    .line 83
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->C()Lmn6;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    move p1, v3

    .line 88
    iget-object v3, v7, Lpp6;->j0:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v4, v7, Lpp6;->k0:Ljava/lang/String;

    .line 91
    .line 92
    sget-object v5, Lmr2;->Z:Lmr2;

    .line 93
    .line 94
    iget-object v0, v7, Lpp6;->i0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 95
    .line 96
    iget-boolean v6, v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->U0:Z

    .line 97
    .line 98
    iput-boolean p1, v7, Lpp6;->h0:Z

    .line 99
    .line 100
    sget-object p1, Lmn6;->j:Lvz7;

    .line 101
    .line 102
    invoke-virtual/range {v2 .. v7}, Lmn6;->C(Ljava/lang/String;Ljava/lang/String;Lmr2;ZLs51;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, p0, :cond_5

    .line 107
    .line 108
    move-object v1, p0

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    :goto_2
    sget-object v1, Ldn8;->a:Ldn8;

    .line 111
    .line 112
    :goto_3
    return-object v1

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
