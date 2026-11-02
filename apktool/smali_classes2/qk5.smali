.class public final synthetic Lqk5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lqk5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lqk5;->Y:Ljava/util/Set;

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
    .locals 8

    .line 1
    iget-byte v0, p0, Lqk5;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lqk5;->Y:Ljava/util/Set;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lsu/happ/proxyutility/dto/ServerCache;

    .line 10
    .line 11
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Lsu/happ/proxyutility/domain/sub/GuId;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lsu/happ/proxyutility/domain/sub/GuId;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 30
    .line 31
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lwv0;->l0(Ljava/lang/Iterable;)Lhu;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Lqk5;

    .line 40
    .line 41
    const/4 v2, 0x4

    .line 42
    invoke-direct {v0, p0, v2}, Lqk5;-><init>(Ljava/util/Set;B)V

    .line 43
    .line 44
    .line 45
    new-instance p0, Lla2;

    .line 46
    .line 47
    invoke-direct {p0, p1, v1, v0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lzx6;

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    invoke-direct {p1, v0}, Lzx6;-><init>(B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p1}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sget-object p1, Li27;->X:Li27;

    .line 61
    .line 62
    new-instance v0, Lla2;

    .line 63
    .line 64
    invoke-direct {v0, p0, v1, p1}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_1
    check-cast p1, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 69
    .line 70
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    xor-int/2addr p0, v1

    .line 84
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_2
    check-cast p1, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 90
    .line 91
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

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
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_3
    move-object v0, p1

    .line 110
    check-cast v0, Llk5;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    check-cast p0, Ljava/lang/Iterable;

    .line 116
    .line 117
    iget-object p1, v0, Llk5;->d:Lkm5;

    .line 118
    .line 119
    invoke-static {p0, p1}, Lwv0;->T0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lmb6;->g0(Ljava/lang/Iterable;)Lkm5;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iget-object p0, v0, Llk5;->c:Lj2;

    .line 128
    .line 129
    sget-object p1, Lec7;->Y:Lec7;

    .line 130
    .line 131
    invoke-virtual {p1}, Lec7;->c()Lqm5;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-virtual {p0, v2}, Lz1;->listIterator(I)Ljava/util/ListIterator;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_0

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Lsu/happ/proxyutility/dto/AppInfo;

    .line 151
    .line 152
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/AppInfo;->e()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    rsub-int/lit8 v3, v3, 0x1

    .line 157
    .line 158
    invoke-static {v2, v3}, Lsu/happ/proxyutility/dto/AppInfo;->a(Lsu/happ/proxyutility/dto/AppInfo;I)Lsu/happ/proxyutility/dto/AppInfo;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {p1, v2}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_0
    invoke-virtual {p1}, Lqm5;->c()Lj2;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    const/4 v6, 0x0

    .line 171
    const/16 v7, 0x33

    .line 172
    .line 173
    const/4 v1, 0x0

    .line 174
    const/4 v2, 0x0

    .line 175
    const/4 v5, 0x0

    .line 176
    invoke-static/range {v0 .. v7}, Llk5;->a(Llk5;Ljk5;Ljava/lang/String;Lj2;Lkm5;Lj2;ZI)Llk5;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
