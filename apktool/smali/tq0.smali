.class public final Ltq0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw60;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1}, Lw60;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Ltq0;->a:Lvz7;

    .line 16
    .line 17
    new-instance v0, Lw60;

    .line 18
    .line 19
    const/4 v1, 0x6

    .line 20
    invoke-direct {v0, v1}, Lw60;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lvz7;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Ltq0;->b:Lvz7;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Ltn;Lrn2;Ls51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lrq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lrq0;

    .line 7
    .line 8
    iget v1, v0, Lrq0;->m0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lrq0;->m0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lrq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lrq0;-><init>(Ltq0;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lrq0;->k0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lrq0;->m0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lrq0;->j0:Lrn2;

    .line 35
    .line 36
    iget-object p2, v0, Lrq0;->i0:Lsu/happ/proxyutility/domain/sub/SubId;

    .line 37
    .line 38
    iget-object v1, v0, Lrq0;->h0:Ljava/util/Iterator;

    .line 39
    .line 40
    iget-object v3, v0, Lrq0;->g0:Lrn2;

    .line 41
    .line 42
    iget-object v4, v0, Lrq0;->f0:Ltn;

    .line 43
    .line 44
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v9, v3

    .line 48
    move-object v3, p0

    .line 49
    move-object p0, v9

    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object p3, Lkw4;->a:Lkw4;

    .line 63
    .line 64
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    new-instance v1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    :cond_3
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_4

    .line 82
    .line 83
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    move-object v4, v3

    .line 88
    check-cast v4, Lqg5;

    .line 89
    .line 90
    iget-object v4, v4, Lqg5;->Y:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 93
    .line 94
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-nez v4, :cond_3

    .line 105
    .line 106
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    move-object v4, p1

    .line 115
    move-object v1, p3

    .line 116
    move-object v5, v0

    .line 117
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_7

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Lqg5;

    .line 128
    .line 129
    iget-object p3, p1, Lqg5;->X:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p3, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 132
    .line 133
    invoke-virtual {p3}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v8, p1

    .line 140
    check-cast v8, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 141
    .line 142
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/SubscriptionItem;->F()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-eqz v6, :cond_6

    .line 151
    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    new-instance p1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 155
    .line 156
    invoke-direct {p1, v7}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iput-object v4, v5, Lrq0;->f0:Ltn;

    .line 160
    .line 161
    iput-object p2, v5, Lrq0;->g0:Lrn2;

    .line 162
    .line 163
    iput-object v1, v5, Lrq0;->h0:Ljava/util/Iterator;

    .line 164
    .line 165
    iput-object p1, v5, Lrq0;->i0:Lsu/happ/proxyutility/domain/sub/SubId;

    .line 166
    .line 167
    iput-object p2, v5, Lrq0;->j0:Lrn2;

    .line 168
    .line 169
    iput v2, v5, Lrq0;->m0:I

    .line 170
    .line 171
    move-object v3, p0

    .line 172
    invoke-virtual/range {v3 .. v8}, Ltq0;->b(Ltn;Ls51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    sget-object p0, Lc71;->X:Lc71;

    .line 177
    .line 178
    if-ne p3, p0, :cond_5

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_5
    move-object p0, p2

    .line 182
    move-object v0, v5

    .line 183
    move-object p2, p1

    .line 184
    move-object p1, p0

    .line 185
    :goto_3
    invoke-interface {p1, p2, p3}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-object p2, p0

    .line 189
    move-object v5, v0

    .line 190
    goto :goto_4

    .line 191
    :cond_6
    move-object v3, p0

    .line 192
    :goto_4
    move-object p0, v3

    .line 193
    goto :goto_2

    .line 194
    :cond_7
    sget-object p0, Ldn8;->a:Ldn8;

    .line 195
    .line 196
    return-object p0
.end method

.method public final b(Ltn;Ls51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lsq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lsq0;

    .line 7
    .line 8
    iget v1, v0, Lsq0;->l0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsq0;->l0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lsq0;-><init>(Ltq0;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lsq0;->j0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsq0;->l0:I

    .line 28
    .line 29
    sget-object v2, Lv83;->a:Lv83;

    .line 30
    .line 31
    sget-object v3, Lw83;->a:Lw83;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x0

    .line 36
    sget-object v7, Lc71;->X:Lc71;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v4, :cond_2

    .line 41
    .line 42
    if-ne v1, v5, :cond_1

    .line 43
    .line 44
    iget-object p0, v0, Lsq0;->i0:Ljava/lang/String;

    .line 45
    .line 46
    iget-object p1, v0, Lsq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 47
    .line 48
    iget-object p3, v0, Lsq0;->g0:Ljava/lang/String;

    .line 49
    .line 50
    iget-object p4, v0, Lsq0;->f0:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v6

    .line 63
    :cond_2
    iget-object p1, v0, Lsq0;->i0:Ljava/lang/String;

    .line 64
    .line 65
    iget-object p5, v0, Lsq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 66
    .line 67
    iget-object p4, v0, Lsq0;->g0:Ljava/lang/String;

    .line 68
    .line 69
    iget-object p3, v0, Lsq0;->f0:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-static {p2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-static {p2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    return-object v2

    .line 100
    :cond_5
    if-nez p2, :cond_15

    .line 101
    .line 102
    if-nez p4, :cond_6

    .line 103
    .line 104
    sget-object p2, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lrl8;->a()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    goto :goto_1

    .line 114
    :cond_6
    move-object p2, p4

    .line 115
    :goto_1
    iget-object v1, p0, Ltq0;->a:Lvz7;

    .line 116
    .line 117
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Lqo;

    .line 122
    .line 123
    iput-object p3, v0, Lsq0;->f0:Ljava/lang/String;

    .line 124
    .line 125
    iput-object p4, v0, Lsq0;->g0:Ljava/lang/String;

    .line 126
    .line 127
    iput-object p5, v0, Lsq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 128
    .line 129
    iput-object p2, v0, Lsq0;->i0:Ljava/lang/String;

    .line 130
    .line 131
    iput v4, v0, Lsq0;->l0:I

    .line 132
    .line 133
    invoke-virtual {v1, p1, p5, v0}, Lqo;->g(Ltn;Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v7, :cond_7

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    move-object v8, p2

    .line 141
    move-object p2, p1

    .line 142
    move-object p1, v8

    .line 143
    :goto_2
    move-object v1, p2

    .line 144
    check-cast v1, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 145
    .line 146
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;->d()Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_8
    move-object p2, v6

    .line 154
    :goto_3
    check-cast p2, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 155
    .line 156
    if-nez p2, :cond_a

    .line 157
    .line 158
    iget-object p0, p0, Ltq0;->b:Lvz7;

    .line 159
    .line 160
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, Lvr1;

    .line 165
    .line 166
    iput-object p3, v0, Lsq0;->f0:Ljava/lang/String;

    .line 167
    .line 168
    iput-object p4, v0, Lsq0;->g0:Ljava/lang/String;

    .line 169
    .line 170
    iput-object p5, v0, Lsq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 171
    .line 172
    iput-object p1, v0, Lsq0;->i0:Ljava/lang/String;

    .line 173
    .line 174
    iput v5, v0, Lsq0;->l0:I

    .line 175
    .line 176
    invoke-virtual {p0, p5, v0}, Lvr1;->a(Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    if-ne p2, v7, :cond_9

    .line 181
    .line 182
    :goto_4
    return-object v7

    .line 183
    :cond_9
    move-object p0, p4

    .line 184
    move-object p4, p3

    .line 185
    move-object p3, p0

    .line 186
    move-object p0, p1

    .line 187
    move-object p1, p5

    .line 188
    :goto_5
    check-cast p2, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 189
    .line 190
    move-object p5, p4

    .line 191
    move-object p4, p3

    .line 192
    move-object p3, p5

    .line 193
    move-object p5, p1

    .line 194
    move-object p1, p0

    .line 195
    :cond_a
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;->a()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;->b()Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;->c()Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;->e()Z

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    if-eqz p2, :cond_11

    .line 212
    .line 213
    if-eqz p4, :cond_10

    .line 214
    .line 215
    sget-object p0, Lkw4;->a:Lkw4;

    .line 216
    .line 217
    invoke-static {}, Lkw4;->h()Lcom/tencent/mmkv/MMKV;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    const-string p2, "SELECTED_SERVER"

    .line 222
    .line 223
    invoke-virtual {p0, p2}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    if-eqz p0, :cond_b

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_b
    move-object p0, v6

    .line 231
    :goto_6
    if-eqz p0, :cond_c

    .line 232
    .line 233
    invoke-static {p0}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    goto :goto_7

    .line 238
    :cond_c
    move-object p0, v6

    .line 239
    :goto_7
    if-eqz p0, :cond_d

    .line 240
    .line 241
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ServerConfig;->i()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    :cond_d
    if-nez v6, :cond_e

    .line 246
    .line 247
    const/4 p0, 0x0

    .line 248
    goto :goto_8

    .line 249
    :cond_e
    invoke-virtual {v6, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    :goto_8
    if-eqz p0, :cond_f

    .line 254
    .line 255
    sget-object p0, Lss8;->a:Lss8;

    .line 256
    .line 257
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 258
    .line 259
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-static {p0}, Lss8;->I(Landroid/content/Context;)V

    .line 264
    .line 265
    .line 266
    :cond_f
    invoke-static {p4}, Lkw4;->r(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :cond_10
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 270
    .line 271
    invoke-virtual {p5, p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->o0(Ljava/lang/Boolean;)V

    .line 272
    .line 273
    .line 274
    sget-object p0, Lkw4;->a:Lkw4;

    .line 275
    .line 276
    invoke-static {p5, p1}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-object v2

    .line 280
    :cond_11
    invoke-virtual {p5, p3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->q0(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    if-eqz v0, :cond_12

    .line 284
    .line 285
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;->b()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    goto :goto_9

    .line 290
    :cond_12
    move-object p2, v6

    .line 291
    :goto_9
    invoke-virtual {p5, p2, p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    if-eqz v0, :cond_13

    .line 295
    .line 296
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;->c()I

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    sget-object p2, Lsu/happ/proxyutility/dto/SubscriptionItem;->Companion:Lsu/happ/proxyutility/dto/SubscriptionItem$Companion;

    .line 301
    .line 302
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-static {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem$Companion;->a(I)Lsu/happ/proxyutility/dto/SubscriptionItem$Status;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    goto :goto_a

    .line 310
    :cond_13
    move-object p0, v6

    .line 311
    :goto_a
    invoke-static {p5, p0, v1, v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u0(Lsu/happ/proxyutility/dto/SubscriptionItem;Lsu/happ/proxyutility/dto/SubscriptionItem$Status;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 312
    .line 313
    .line 314
    if-eqz v0, :cond_14

    .line 315
    .line 316
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;->a()Z

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    :cond_14
    invoke-virtual {p5, v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->o0(Ljava/lang/Boolean;)V

    .line 325
    .line 326
    .line 327
    sget-object p0, Lkw4;->a:Lkw4;

    .line 328
    .line 329
    invoke-static {p5, p1}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-object v3

    .line 333
    :cond_15
    invoke-static {}, Lb61;->c()V

    .line 334
    .line 335
    .line 336
    return-object v6
.end method
