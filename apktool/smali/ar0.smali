.class public final Lar0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lvz7;


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
    const/4 v1, 0x7

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
    iput-object v1, p0, Lar0;->a:Lvz7;

    .line 16
    .line 17
    new-instance v0, Lw60;

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lw60;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lvz7;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lar0;->b:Lvz7;

    .line 30
    .line 31
    new-instance v0, Lw60;

    .line 32
    .line 33
    const/16 v1, 0x9

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lw60;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lvz7;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lar0;->c:Lvz7;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(Ls51;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Lvq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lvq0;

    .line 7
    .line 8
    iget v1, v0, Lvq0;->i0:I

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
    iput v1, v0, Lvq0;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lvq0;-><init>(Lar0;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lvq0;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lvq0;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v0, Lvq0;->f0:Ljava/util/Iterator;

    .line 36
    .line 37
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lkw4;->a:Lkw4;

    .line 51
    .line 52
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v1, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    move-object v5, v4

    .line 76
    check-cast v5, Lqg5;

    .line 77
    .line 78
    iget-object v5, v5, Lqg5;->Y:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v5, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 81
    .line 82
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    if-eqz v6, :cond_3

    .line 87
    .line 88
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d0()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_4

    .line 93
    .line 94
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->c0()Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    :cond_4
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    move-object v1, p1

    .line 109
    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_7

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Lqg5;

    .line 120
    .line 121
    iget-object v4, p1, Lqg5;->X:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v4, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 124
    .line 125
    invoke-virtual {v4}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    const/4 v6, 0x3

    .line 135
    invoke-static {v5, v6}, Lx97;->a0(II)Lkf3;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    new-instance v7, Lj31;

    .line 140
    .line 141
    invoke-direct {v7, v5, v6}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    new-instance v5, Lxq0;

    .line 145
    .line 146
    invoke-direct {v5, p0, p1, v4, v3}, Lxq0;-><init>(Lar0;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Lq51;)V

    .line 147
    .line 148
    .line 149
    new-instance p1, Lpi;

    .line 150
    .line 151
    const/16 v4, 0x8

    .line 152
    .line 153
    invoke-direct {p1, v7, v5, v3, v4}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 154
    .line 155
    .line 156
    new-instance v4, Lj31;

    .line 157
    .line 158
    const/4 v5, 0x7

    .line 159
    invoke-direct {v4, p1, v5}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 160
    .line 161
    .line 162
    new-instance p1, Lq5;

    .line 163
    .line 164
    const/4 v5, 0x2

    .line 165
    const/4 v6, 0x4

    .line 166
    invoke-direct {p1, v5, v3, v6}, Lq5;-><init>(ILq51;B)V

    .line 167
    .line 168
    .line 169
    iput-object v1, v0, Lvq0;->f0:Ljava/util/Iterator;

    .line 170
    .line 171
    iput v2, v0, Lvq0;->i0:I

    .line 172
    .line 173
    invoke-static {v4, p1, v0}, Lvr3;->f(Lj31;Lq5;Ls51;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    sget-object v4, Lc71;->X:Lc71;

    .line 178
    .line 179
    if-ne p1, v4, :cond_6

    .line 180
    .line 181
    return-object v4

    .line 182
    :cond_7
    sget-object p0, Ldn8;->a:Ldn8;

    .line 183
    .line 184
    return-object p0
.end method

.method public final b(Lrn2;Ls51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lyq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lyq0;

    .line 7
    .line 8
    iget v1, v0, Lyq0;->k0:I

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
    iput v1, v0, Lyq0;->k0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lyq0;-><init>(Lar0;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lyq0;->i0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lyq0;->k0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lyq0;->h0:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, v0, Lyq0;->g0:Ljava/util/Iterator;

    .line 38
    .line 39
    iget-object v4, v0, Lyq0;->f0:Lrn2;

    .line 40
    .line 41
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v6, p1

    .line 45
    move-object v9, v0

    .line 46
    move-object p1, v4

    .line 47
    move-object v4, p0

    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object p2, Lkw4;->a:Lkw4;

    .line 60
    .line 61
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    new-instance v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_4

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    move-object v5, v4

    .line 85
    check-cast v5, Lqg5;

    .line 86
    .line 87
    iget-object v5, v5, Lqg5;->Y:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v5, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 90
    .line 91
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    if-eqz v6, :cond_3

    .line 96
    .line 97
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d0()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_3

    .line 102
    .line 103
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    move-object v1, p2

    .line 112
    move-object v9, v0

    .line 113
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_9

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    check-cast p2, Lqg5;

    .line 124
    .line 125
    iget-object v0, p2, Lqg5;->X:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 128
    .line 129
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    iget-object p2, p2, Lqg5;->Y:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v7, p2

    .line 136
    check-cast v7, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 137
    .line 138
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    if-eqz p2, :cond_5

    .line 143
    .line 144
    new-instance v0, Lsu/happ/proxyutility/dto/ProviderId;

    .line 145
    .line 146
    invoke-direct {v0, p2}, Lsu/happ/proxyutility/dto/ProviderId;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    move-object v0, v3

    .line 151
    :goto_3
    if-eqz v0, :cond_8

    .line 152
    .line 153
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ProviderId;->d()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    iput-object p1, v9, Lyq0;->f0:Lrn2;

    .line 158
    .line 159
    iput-object v1, v9, Lyq0;->g0:Ljava/util/Iterator;

    .line 160
    .line 161
    iput-object v6, v9, Lyq0;->h0:Ljava/lang/String;

    .line 162
    .line 163
    iput v2, v9, Lyq0;->k0:I

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    move-object v4, p0

    .line 167
    invoke-virtual/range {v4 .. v9}, Lar0;->c(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLs51;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    sget-object p0, Lc71;->X:Lc71;

    .line 172
    .line 173
    if-ne p2, p0, :cond_6

    .line 174
    .line 175
    return-object p0

    .line 176
    :cond_6
    :goto_4
    check-cast p2, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 177
    .line 178
    if-eqz p2, :cond_7

    .line 179
    .line 180
    new-instance p0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 181
    .line 182
    invoke-direct {p0, v6}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p1, p0, p2}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    :cond_7
    move-object p0, v4

    .line 189
    goto :goto_2

    .line 190
    :cond_8
    const-string p0, "Required value was null."

    .line 191
    .line 192
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-object v3

    .line 196
    :cond_9
    sget-object p0, Ldn8;->a:Ldn8;

    .line 197
    .line 198
    return-object p0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLs51;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    instance-of v6, v5, Lzq0;

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    check-cast v6, Lzq0;

    .line 19
    .line 20
    iget v7, v6, Lzq0;->l0:I

    .line 21
    .line 22
    const/high16 v8, -0x80000000

    .line 23
    .line 24
    and-int v9, v7, v8

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    sub-int/2addr v7, v8

    .line 29
    iput v7, v6, Lzq0;->l0:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v6, Lzq0;

    .line 33
    .line 34
    invoke-direct {v6, v0, v5}, Lzq0;-><init>(Lar0;Ls51;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v5, v6, Lzq0;->j0:Ljava/lang/Object;

    .line 38
    .line 39
    iget v7, v6, Lzq0;->l0:I

    .line 40
    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v9, 0x2

    .line 43
    const/4 v10, 0x1

    .line 44
    const/4 v11, 0x0

    .line 45
    sget-object v12, Lc71;->X:Lc71;

    .line 46
    .line 47
    if-eqz v7, :cond_4

    .line 48
    .line 49
    if-eq v7, v10, :cond_3

    .line 50
    .line 51
    if-eq v7, v9, :cond_2

    .line 52
    .line 53
    if-ne v7, v8, :cond_1

    .line 54
    .line 55
    iget-object v0, v6, Lzq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 56
    .line 57
    iget-object v1, v6, Lzq0;->g0:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v2, v6, Lzq0;->f0:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 p5, v2

    .line 65
    .line 66
    move-object v2, v1

    .line 67
    move-object/from16 v1, p5

    .line 68
    .line 69
    move-object/from16 p5, v11

    .line 70
    .line 71
    goto/16 :goto_a

    .line 72
    .line 73
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v11

    .line 79
    :cond_2
    iget-boolean v1, v6, Lzq0;->i0:Z

    .line 80
    .line 81
    iget-object v2, v6, Lzq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 82
    .line 83
    iget-object v3, v6, Lzq0;->g0:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, v6, Lzq0;->f0:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object/from16 p5, v4

    .line 91
    .line 92
    move v4, v1

    .line 93
    move-object/from16 v1, p5

    .line 94
    .line 95
    move-object/from16 p5, v3

    .line 96
    .line 97
    move-object v3, v2

    .line 98
    move-object/from16 v2, p5

    .line 99
    .line 100
    move-object/from16 p5, v11

    .line 101
    .line 102
    goto/16 :goto_7

    .line 103
    .line 104
    :cond_3
    iget-object v0, v6, Lzq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 105
    .line 106
    iget-object v1, v6, Lzq0;->g0:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v2, v6, Lzq0;->f0:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object/from16 v17, v2

    .line 114
    .line 115
    move-object v2, v1

    .line 116
    move-object/from16 v1, v17

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    invoke-static {v5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v5, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 123
    .line 124
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v5}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    new-instance v7, Luq0;

    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    invoke-direct {v7, v3, v13}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v7}, Lkf4;->h(Lgn2;)V

    .line 139
    .line 140
    .line 141
    iget-object v5, v0, Lar0;->b:Lvz7;

    .line 142
    .line 143
    if-eqz v4, :cond_6

    .line 144
    .line 145
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lqo;

    .line 150
    .line 151
    iput-object v1, v6, Lzq0;->f0:Ljava/lang/String;

    .line 152
    .line 153
    iput-object v2, v6, Lzq0;->g0:Ljava/lang/String;

    .line 154
    .line 155
    iput-object v3, v6, Lzq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 156
    .line 157
    iput-boolean v4, v6, Lzq0;->i0:Z

    .line 158
    .line 159
    iput v10, v6, Lzq0;->l0:I

    .line 160
    .line 161
    invoke-virtual {v0, v3, v1, v6}, Lqo;->h(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    if-ne v5, v12, :cond_5

    .line 166
    .line 167
    goto/16 :goto_9

    .line 168
    .line 169
    :cond_5
    move-object v0, v3

    .line 170
    :goto_1
    check-cast v5, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 171
    .line 172
    move-object/from16 p5, v11

    .line 173
    .line 174
    goto/16 :goto_b

    .line 175
    .line 176
    :cond_6
    iget-object v7, v0, Lar0;->a:Lvz7;

    .line 177
    .line 178
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    check-cast v7, Lp72;

    .line 183
    .line 184
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    sget-object v13, Lss8;->a:Lss8;

    .line 191
    .line 192
    invoke-static {v3}, Lss8;->q(Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    instance-of v14, v13, Lrj6;

    .line 197
    .line 198
    if-eqz v14, :cond_7

    .line 199
    .line 200
    move-object v13, v11

    .line 201
    :cond_7
    check-cast v13, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 202
    .line 203
    if-eqz v13, :cond_8

    .line 204
    .line 205
    invoke-virtual {v13}, Lsu/happ/proxyutility/dto/HashedDomain;->c()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    goto :goto_2

    .line 210
    :cond_8
    move-object v13, v11

    .line 211
    :goto_2
    if-nez v13, :cond_9

    .line 212
    .line 213
    new-instance v7, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 214
    .line 215
    sget-object v10, Lsu/happ/proxyutility/dto/enums/TypeCheck;->FILE:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 216
    .line 217
    invoke-direct {v7, v11, v10, v8}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 218
    .line 219
    .line 220
    :goto_3
    move-object/from16 p5, v11

    .line 221
    .line 222
    goto/16 :goto_5

    .line 223
    .line 224
    :cond_9
    if-nez v1, :cond_a

    .line 225
    .line 226
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    if-nez v14, :cond_b

    .line 231
    .line 232
    new-instance v7, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 233
    .line 234
    sget-object v10, Lsu/happ/proxyutility/dto/enums/TypeCheck;->FILE:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 235
    .line 236
    invoke-direct {v7, v13, v10, v9}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_a
    move-object v14, v1

    .line 241
    :cond_b
    invoke-virtual {v7}, Lp72;->c()Ll72;

    .line 242
    .line 243
    .line 244
    move-result-object v15

    .line 245
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    move-object/from16 p5, v11

    .line 249
    .line 250
    iget-object v11, v15, Ll72;->c:Lh76;

    .line 251
    .line 252
    iget-object v11, v11, Lh76;->X:Loh7;

    .line 253
    .line 254
    invoke-virtual {v11}, Loh7;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    check-cast v11, Ljava/util/Map;

    .line 259
    .line 260
    invoke-interface {v11, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    check-cast v11, Ljava/util/List;

    .line 265
    .line 266
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 267
    .line 268
    .line 269
    move-result-object v16

    .line 270
    invoke-virtual/range {v16 .. v16}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    new-instance v9, Lp0;

    .line 275
    .line 276
    const/16 v10, 0x14

    .line 277
    .line 278
    invoke-direct {v9, v14, v11, v10}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v8, v9}, Lkf4;->h(Lgn2;)V

    .line 282
    .line 283
    .line 284
    if-eqz v11, :cond_c

    .line 285
    .line 286
    invoke-interface {v11, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v8

    .line 290
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    invoke-virtual {v9}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    new-instance v10, Lzs1;

    .line 299
    .line 300
    const/4 v11, 0x1

    .line 301
    invoke-direct {v10, v8, v15, v11}, Lzs1;-><init>(ZLjava/lang/Object;B)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v9, v10}, Lkf4;->h(Lgn2;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    invoke-virtual {v15}, Ll72;->f()Z

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    if-nez v9, :cond_c

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_c
    move-object/from16 v8, p5

    .line 319
    .line 320
    :goto_4
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    invoke-virtual {v9}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    new-instance v10, Lp0;

    .line 329
    .line 330
    const/16 v11, 0x15

    .line 331
    .line 332
    invoke-direct {v10, v8, v7, v11}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9, v10}, Lkf4;->h(Lgn2;)V

    .line 336
    .line 337
    .line 338
    if-eqz v8, :cond_d

    .line 339
    .line 340
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    if-eqz v7, :cond_d

    .line 345
    .line 346
    new-instance v7, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 347
    .line 348
    new-instance v8, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 349
    .line 350
    invoke-direct {v8}, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;-><init>()V

    .line 351
    .line 352
    .line 353
    sget-object v9, Lsu/happ/proxyutility/dto/enums/TypeCheck;->FILE:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 354
    .line 355
    invoke-direct {v7, v13, v8, v9}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;Lsu/happ/proxyutility/dto/enums/TypeCheck;)V

    .line 356
    .line 357
    .line 358
    goto :goto_5

    .line 359
    :cond_d
    move-object/from16 v7, p5

    .line 360
    .line 361
    :goto_5
    if-nez v7, :cond_14

    .line 362
    .line 363
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    if-eqz v7, :cond_e

    .line 368
    .line 369
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/MetaParams;->y0()Ljava/lang/Boolean;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    goto :goto_6

    .line 374
    :cond_e
    move-object/from16 v7, p5

    .line 375
    .line 376
    :goto_6
    if-nez v7, :cond_13

    .line 377
    .line 378
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    check-cast v5, Lqo;

    .line 383
    .line 384
    iput-object v1, v6, Lzq0;->f0:Ljava/lang/String;

    .line 385
    .line 386
    iput-object v2, v6, Lzq0;->g0:Ljava/lang/String;

    .line 387
    .line 388
    iput-object v3, v6, Lzq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 389
    .line 390
    iput-boolean v4, v6, Lzq0;->i0:Z

    .line 391
    .line 392
    const/4 v7, 0x2

    .line 393
    iput v7, v6, Lzq0;->l0:I

    .line 394
    .line 395
    invoke-virtual {v5, v3, v1, v6}, Lqo;->h(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    if-ne v5, v12, :cond_f

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_f
    :goto_7
    move-object v7, v5

    .line 403
    check-cast v7, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 404
    .line 405
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;->d()Z

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    if-eqz v7, :cond_10

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_10
    move-object/from16 v5, p5

    .line 413
    .line 414
    :goto_8
    check-cast v5, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 415
    .line 416
    if-nez v5, :cond_12

    .line 417
    .line 418
    iget-object v0, v0, Lar0;->c:Lvz7;

    .line 419
    .line 420
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    check-cast v0, Lvr1;

    .line 425
    .line 426
    iput-object v1, v6, Lzq0;->f0:Ljava/lang/String;

    .line 427
    .line 428
    iput-object v2, v6, Lzq0;->g0:Ljava/lang/String;

    .line 429
    .line 430
    iput-object v3, v6, Lzq0;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 431
    .line 432
    iput-boolean v4, v6, Lzq0;->i0:Z

    .line 433
    .line 434
    const/4 v4, 0x3

    .line 435
    iput v4, v6, Lzq0;->l0:I

    .line 436
    .line 437
    invoke-virtual {v0, v3, v1, v6}, Lvr1;->b(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    if-ne v5, v12, :cond_11

    .line 442
    .line 443
    :goto_9
    return-object v12

    .line 444
    :cond_11
    move-object v0, v3

    .line 445
    :goto_a
    check-cast v5, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_12
    move-object v0, v3

    .line 449
    goto :goto_b

    .line 450
    :cond_13
    return-object p5

    .line 451
    :cond_14
    move-object v0, v3

    .line 452
    move-object v5, v7

    .line 453
    :goto_b
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;->a()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;->b()Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;->c()Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    invoke-virtual {v0, v1, v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    if-eqz v4, :cond_15

    .line 469
    .line 470
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;->a()I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    sget-object v3, Lsu/happ/proxyutility/dto/SubscriptionItem;->Companion:Lsu/happ/proxyutility/dto/SubscriptionItem$Companion;

    .line 475
    .line 476
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-static {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem$Companion;->a(I)Lsu/happ/proxyutility/dto/SubscriptionItem$Status;

    .line 480
    .line 481
    .line 482
    move-result-object v11

    .line 483
    :goto_c
    const/4 v7, 0x2

    .line 484
    goto :goto_d

    .line 485
    :cond_15
    move-object/from16 v11, p5

    .line 486
    .line 487
    goto :goto_c

    .line 488
    :goto_d
    invoke-static {v0, v11, v5, v7}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u0(Lsu/happ/proxyutility/dto/SubscriptionItem;Lsu/happ/proxyutility/dto/SubscriptionItem$Status;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 489
    .line 490
    .line 491
    if-eqz v4, :cond_16

    .line 492
    .line 493
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 494
    .line 495
    .line 496
    move-result-wide v5

    .line 497
    new-instance v1, Ljava/lang/Long;

    .line 498
    .line 499
    invoke-direct {v1, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->m0(Ljava/lang/Long;)V

    .line 503
    .line 504
    .line 505
    :cond_16
    sget-object v1, Lkw4;->a:Lkw4;

    .line 506
    .line 507
    invoke-static {v0, v2}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    return-object v4
.end method
