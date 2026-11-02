.class public final Lxq0;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public g0:Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

.field public h0:B

.field public synthetic i0:Lze2;

.field public synthetic j0:I

.field public final synthetic k0:Lar0;

.field public final synthetic l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public final synthetic m0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lar0;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxq0;->k0:Lar0;

    .line 2
    .line 3
    iput-object p2, p0, Lxq0;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 4
    .line 5
    iput-object p3, p0, Lxq0;->m0:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v6, p0, Lxq0;->i0:Lze2;

    .line 2
    .line 3
    iget v7, p0, Lxq0;->j0:I

    .line 4
    .line 5
    iget-byte v0, p0, Lxq0;->h0:B

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    const/4 v9, 0x3

    .line 9
    const/4 v10, 0x2

    .line 10
    const/4 v11, 0x1

    .line 11
    const/4 v12, 0x0

    .line 12
    sget-object v13, Lc71;->X:Lc71;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    if-eq v0, v11, :cond_2

    .line 17
    .line 18
    if-eq v0, v10, :cond_1

    .line 19
    .line 20
    if-ne v0, v9, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v12

    .line 33
    :cond_1
    iget-object v0, p0, Lxq0;->g0:Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 34
    .line 35
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v0, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 48
    .line 49
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Lwq0;

    .line 58
    .line 59
    iget-object v2, p0, Lxq0;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 60
    .line 61
    invoke-direct {v1, v2, v7, v8}, Lwq0;-><init>(Ljava/lang/Object;IB)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    new-instance v1, Lsu/happ/proxyutility/dto/ProviderId;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/dto/ProviderId;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    move-object v1, v12

    .line 80
    :goto_0
    if-eqz v1, :cond_a

    .line 81
    .line 82
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ProviderId;->d()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v6, p0, Lxq0;->i0:Lze2;

    .line 87
    .line 88
    iput v7, p0, Lxq0;->j0:I

    .line 89
    .line 90
    iput-byte v11, p0, Lxq0;->h0:B

    .line 91
    .line 92
    iget-object v0, p0, Lxq0;->k0:Lar0;

    .line 93
    .line 94
    iget-object v2, p0, Lxq0;->m0:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v3, p0, Lxq0;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 97
    .line 98
    const/4 v4, 0x1

    .line 99
    move-object v5, p0

    .line 100
    invoke-virtual/range {v0 .. v5}, Lar0;->c(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLs51;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-ne v0, v13, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    :goto_1
    check-cast v0, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 108
    .line 109
    iput-object v12, p0, Lxq0;->i0:Lze2;

    .line 110
    .line 111
    iput-object v0, p0, Lxq0;->g0:Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 112
    .line 113
    iput v7, p0, Lxq0;->j0:I

    .line 114
    .line 115
    iput-byte v10, p0, Lxq0;->h0:B

    .line 116
    .line 117
    invoke-interface {v6, v0, p0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-ne v1, v13, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    :goto_2
    if-eqz v0, :cond_7

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_7
    if-ge v7, v10, :cond_9

    .line 128
    .line 129
    sget-object v0, Lgx1;->Y:Lbe;

    .line 130
    .line 131
    const/16 v0, 0xf

    .line 132
    .line 133
    sget-object v1, Llx1;->f0:Llx1;

    .line 134
    .line 135
    invoke-static {v0, v1}, Lvj8;->l0(ILlx1;)J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    iput-object v12, p0, Lxq0;->i0:Lze2;

    .line 140
    .line 141
    iput-object v12, p0, Lxq0;->g0:Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 142
    .line 143
    iput v7, p0, Lxq0;->j0:I

    .line 144
    .line 145
    iput-byte v9, p0, Lxq0;->h0:B

    .line 146
    .line 147
    invoke-static {v0, v1, p0}, Lu70;->G(JLq51;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-ne v0, v13, :cond_8

    .line 152
    .line 153
    :goto_3
    return-object v13

    .line 154
    :cond_8
    :goto_4
    move v8, v11

    .line 155
    :cond_9
    :goto_5
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :cond_a
    const-string v0, "Required value was null."

    .line 161
    .line 162
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v12
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lze2;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Lq51;

    .line 10
    .line 11
    new-instance v0, Lxq0;

    .line 12
    .line 13
    iget-object v1, p0, Lxq0;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 14
    .line 15
    iget-object v2, p0, Lxq0;->m0:Ljava/lang/String;

    .line 16
    .line 17
    iget-object p0, p0, Lxq0;->k0:Lar0;

    .line 18
    .line 19
    invoke-direct {v0, p0, v1, v2, p3}, Lxq0;-><init>(Lar0;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Lq51;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, Lxq0;->i0:Lze2;

    .line 23
    .line 24
    iput p2, v0, Lxq0;->j0:I

    .line 25
    .line 26
    sget-object p0, Ldn8;->a:Ldn8;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lxq0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
