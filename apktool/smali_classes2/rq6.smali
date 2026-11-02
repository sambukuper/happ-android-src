.class public final Lrq6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lrq6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lrq6;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lrq6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 0

    .line 1
    new-instance p0, Lrq6;

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkw4;->a:Lkw4;

    .line 5
    .line 6
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance p1, Lhu;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p1, p0, v0}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Lzw5;

    .line 17
    .line 18
    const/16 v1, 0x13

    .line 19
    .line 20
    invoke-direct {p0, v1}, Lzw5;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lla2;

    .line 24
    .line 25
    invoke-direct {v1, p1, v0, p0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Ldm5;->f0:Ldm5;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance p1, Lem5;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lem5;-><init>(Ldm5;)V

    .line 36
    .line 37
    .line 38
    new-instance p0, Lka2;

    .line 39
    .line 40
    invoke-direct {p0, v1}, Lka2;-><init>(Lla2;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0}, Lka2;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v1, 0x0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0}, Lka2;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lqg5;

    .line 55
    .line 56
    iget-object v2, v0, Lqg5;->X:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 61
    .line 62
    check-cast v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 63
    .line 64
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    new-instance v3, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 69
    .line 70
    invoke-direct {v3, v2}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v4, Lyr7;

    .line 74
    .line 75
    invoke-direct {v4, v2, v0, v1}, Lyr7;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v3, v4}, Lem5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {p1}, Lem5;->f()Lcm5;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    sget-object p1, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 96
    .line 97
    invoke-direct {v0, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    move-object p1, p0

    .line 101
    check-cast p1, Ldm5;

    .line 102
    .line 103
    iget-object p1, p1, Ldm5;->Z:Lll5;

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lll5;->containsKey(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_1
    sget-object p1, Ldm5;->f0:Ldm5;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v0, Lem5;

    .line 118
    .line 119
    invoke-direct {v0, p1}, Lem5;-><init>(Ldm5;)V

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 127
    .line 128
    invoke-direct {v2, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance p1, Lyr7;

    .line 132
    .line 133
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    new-instance v4, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 138
    .line 139
    const v5, 0xfffffff

    .line 140
    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    invoke-direct {v4, v6, v5, v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-direct {p1, v3, v4, v1}, Lyr7;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2, p1}, Lem5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p0}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Lem5;->f()Lcm5;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0
.end method
