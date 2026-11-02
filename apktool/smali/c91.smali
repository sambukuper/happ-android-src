.class public final Lc91;
.super Lw45;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic o:B

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Lea6;Lgn2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lc91;->o:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc91;->q:Ljava/io/Serializable;

    .line 8
    .line 9
    iput-object p2, p0, Lc91;->p:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, Lc91;->o:B

    iput-object p1, p0, Lc91;->p:Ljava/lang/Object;

    iput-object p2, p0, Lc91;->q:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final R()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lc91;->o:B

    .line 2
    .line 3
    iget-object p0, p0, Lc91;->q:Ljava/io/Serializable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lea6;

    .line 9
    .line 10
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lts3;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lts3;->f0:Lts3;

    .line 17
    .line 18
    :cond_0
    return-object p0

    .line 19
    :pswitch_0
    check-cast p0, Lea6;

    .line 20
    .line 21
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lld0;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    check-cast p0, [Z

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    aget-boolean p0, p0, v0

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lc91;->o:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    check-cast p1, Lld0;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lc91;->q:Ljava/io/Serializable;

    .line 13
    .line 14
    check-cast v0, Lea6;

    .line 15
    .line 16
    iget-object v1, v0, Lea6;->X:Ljava/lang/Object;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lc91;->p:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lgn2;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    iput-object p1, v0, Lea6;->X:Ljava/lang/Object;

    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lc91;->o:B

    .line 2
    .line 3
    iget-object v1, p0, Lc91;->p:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object p0, p0, Lc91;->q:Ljava/io/Serializable;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lsx4;

    .line 13
    .line 14
    check-cast p0, Lea6;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    sget-object v0, Lll3;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1}, Lel1;->g(Led1;)Lfk2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 28
    .line 29
    invoke-static {v0}, Lll3;->h(Lgk2;)Lqs0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-static {v0}, Lzs3;->b(Lqs0;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Lqe4;->A0:Lqe4;

    .line 41
    .line 42
    invoke-static {p1, v0}, Lz51;->t(Lsx4;Lqe4;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/16 p1, 0x2e

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v0, Lxs3;->b:Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    sget-object p1, Lts3;->X:Lts3;

    .line 72
    .line 73
    iput-object p1, p0, Lea6;->X:Ljava/lang/Object;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    sget-object v0, Lxs3;->d:Ljava/util/LinkedHashSet;

    .line 77
    .line 78
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    sget-object p1, Lts3;->Y:Lts3;

    .line 85
    .line 86
    iput-object p1, p0, Lea6;->X:Ljava/lang/Object;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    sget-object v0, Lxs3;->c:Ljava/util/LinkedHashSet;

    .line 90
    .line 91
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    sget-object p1, Lts3;->Z:Lts3;

    .line 98
    .line 99
    iput-object p1, p0, Lea6;->X:Ljava/lang/Object;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    sget-object v0, Lxs3;->a:Ljava/util/LinkedHashSet;

    .line 103
    .line 104
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_4

    .line 109
    .line 110
    sget-object p1, Lts3;->g0:Lts3;

    .line 111
    .line 112
    iput-object p1, p0, Lea6;->X:Ljava/lang/Object;

    .line 113
    .line 114
    :cond_4
    :goto_1
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 115
    .line 116
    if-nez p0, :cond_5

    .line 117
    .line 118
    move v2, v3

    .line 119
    :cond_5
    return v2

    .line 120
    :pswitch_0
    check-cast p1, Lld0;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    check-cast p0, Lea6;

    .line 126
    .line 127
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 128
    .line 129
    if-nez p0, :cond_6

    .line 130
    .line 131
    move v2, v3

    .line 132
    :cond_6
    return v2

    .line 133
    :pswitch_1
    check-cast p0, [Z

    .line 134
    .line 135
    check-cast v1, Lgn2;

    .line 136
    .line 137
    invoke-interface {v1, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_7

    .line 148
    .line 149
    aput-boolean v3, p0, v2

    .line 150
    .line 151
    :cond_7
    aget-boolean p0, p0, v2

    .line 152
    .line 153
    xor-int/2addr p0, v3

    .line 154
    return p0

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
