.class public final synthetic Llm4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Llm4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Llm4;->Y:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Llm4;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Llm4;->Y:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lqg5;

    .line 10
    .line 11
    iget-object v0, p1, Lqg5;->X:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 14
    .line 15
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 22
    .line 23
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->q()Lzt7;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, v0}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    new-instance v1, Lyf8;

    .line 34
    .line 35
    new-instance v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 36
    .line 37
    invoke-direct {v2, v0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, v2, p1, p0}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-object v1

    .line 44
    :pswitch_0
    check-cast p1, Lj2;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lsu/happ/proxyutility/feature/main/MainViewModel;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 50
    .line 51
    sget-object v0, Lec7;->Y:Lec7;

    .line 52
    .line 53
    invoke-virtual {v0}, Lec7;->c()Lqm5;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v3, v2

    .line 72
    check-cast v3, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 73
    .line 74
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->q()Lzt7;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v2, v4}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    iget-object v2, v2, Lqs7;->j:Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    .line 89
    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    sget-object v2, Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;->WITHOUT:Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    .line 94
    .line 95
    :goto_1
    sget-object v4, Lln4;->b:[I

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    aget v2, v4, v2

    .line 102
    .line 103
    const/4 v4, 0x1

    .line 104
    if-eq v2, v4, :cond_4

    .line 105
    .line 106
    const/4 v4, 0x2

    .line 107
    if-eq v2, v4, :cond_3

    .line 108
    .line 109
    const/4 v4, 0x3

    .line 110
    if-ne v2, v4, :cond_2

    .line 111
    .line 112
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    new-instance v4, Ll71;

    .line 117
    .line 118
    const/16 v5, 0x1d

    .line 119
    .line 120
    invoke-direct {v4, v5}, Ll71;-><init>(B)V

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v4}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    new-instance v5, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 130
    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    const/16 v8, 0x1b

    .line 134
    .line 135
    const/4 v4, 0x0

    .line 136
    const/4 v6, 0x0

    .line 137
    invoke-static/range {v3 .. v8}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->a(Lsu/happ/proxyutility/dto/ConfigGroupCache;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/util/ArrayList;ZZI)Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    goto :goto_2

    .line 142
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    new-instance v4, Ll71;

    .line 151
    .line 152
    const/16 v5, 0x1c

    .line 153
    .line 154
    invoke-direct {v4, v5}, Ll71;-><init>(B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v2, v4}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    new-instance v5, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 164
    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    const/16 v8, 0x1b

    .line 168
    .line 169
    const/4 v4, 0x0

    .line 170
    const/4 v6, 0x0

    .line 171
    invoke-static/range {v3 .. v8}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->a(Lsu/happ/proxyutility/dto/ConfigGroupCache;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/util/ArrayList;ZZI)Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    goto :goto_2

    .line 176
    :cond_4
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {v2}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    const/4 v7, 0x0

    .line 185
    const/16 v8, 0x1b

    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    const/4 v6, 0x0

    .line 189
    invoke-static/range {v3 .. v8}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->a(Lsu/happ/proxyutility/dto/ConfigGroupCache;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/util/ArrayList;ZZI)Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    :goto_2
    invoke-virtual {v0, v2}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_5
    invoke-virtual {v0}, Lqm5;->c()Lj2;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    :goto_3
    return-object v1

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
