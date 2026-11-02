.class public final Lcc0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, Lcc0;->a:B

    packed-switch p1, :pswitch_data_0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 135
    iput-object p1, p0, Lcc0;->b:Ljava/util/ArrayList;

    return-void

    .line 136
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcc0;->b:Ljava/util/ArrayList;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lez3;)V
    .locals 1

    const/4 p1, 0x1

    iput-byte p1, p0, Lcc0;->a:B

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcc0;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ly5;)V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, Lcc0;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget v1, Lk39;->a:I

    .line 8
    .line 9
    new-instance v1, Lx40;

    .line 10
    .line 11
    iget-object v2, p1, Ly5;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Le31;

    .line 14
    .line 15
    iget-object v3, p1, Ly5;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lz35;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-direct {v1, v2, v4}, Lx40;-><init>(Le31;B)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lx40;

    .line 24
    .line 25
    iget-object v5, p1, Ly5;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, Ly40;

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    invoke-direct {v2, v5, v6}, Lx40;-><init>(Le31;B)V

    .line 31
    .line 32
    .line 33
    new-instance v5, Lx40;

    .line 34
    .line 35
    iget-object v7, p1, Ly5;->h0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, Le31;

    .line 38
    .line 39
    const/4 v8, 0x4

    .line 40
    invoke-direct {v5, v7, v8}, Lx40;-><init>(Le31;B)V

    .line 41
    .line 42
    .line 43
    new-array v7, v0, [Lw21;

    .line 44
    .line 45
    aput-object v1, v7, v4

    .line 46
    .line 47
    aput-object v2, v7, v6

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    aput-object v5, v7, v1

    .line 51
    .line 52
    invoke-static {v7}, Li21;->N([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/16 v7, 0x1c

    .line 59
    .line 60
    if-lt v5, v7, :cond_0

    .line 61
    .line 62
    iget-object p1, p1, Ly5;->Y:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Landroid/content/Context;

    .line 65
    .line 66
    const-string v0, "connectivity"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 76
    .line 77
    new-instance v0, Lv35;

    .line 78
    .line 79
    invoke-direct {v0, p1}, Lv35;-><init>(Landroid/net/ConnectivityManager;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    new-instance p1, Lx40;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-direct {p1, v3, v1}, Lx40;-><init>(Le31;B)V

    .line 92
    .line 93
    .line 94
    new-instance v5, Lx40;

    .line 95
    .line 96
    invoke-direct {v5, v3, v0}, Lx40;-><init>(Le31;B)V

    .line 97
    .line 98
    .line 99
    new-instance v7, Ls35;

    .line 100
    .line 101
    invoke-direct {v7, v3}, Lq10;-><init>(Le31;)V

    .line 102
    .line 103
    .line 104
    new-instance v9, Lr35;

    .line 105
    .line 106
    invoke-direct {v9, v3}, Lq10;-><init>(Le31;)V

    .line 107
    .line 108
    .line 109
    new-array v3, v8, [Lq10;

    .line 110
    .line 111
    aput-object p1, v3, v4

    .line 112
    .line 113
    aput-object v5, v3, v6

    .line 114
    .line 115
    aput-object v7, v3, v1

    .line 116
    .line 117
    aput-object v9, v3, v0

    .line 118
    .line 119
    invoke-static {v3}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 124
    .line 125
    .line 126
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v2, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 130
    .line 131
    return-void
.end method


# virtual methods
.method public a(Lbc0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-ge v0, v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lbc0;

    .line 28
    .line 29
    iget-object v1, v1, Lbc0;->a:Ldc0;

    .line 30
    .line 31
    iget v1, v1, Ldc0;->b:I

    .line 32
    .line 33
    iget-object v2, p1, Lbc0;->a:Ldc0;

    .line 34
    .line 35
    iget v2, v2, Ldc0;->b:I

    .line 36
    .line 37
    if-le v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p0, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public b(Lcc0;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcc0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p1, Lcc0;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    :cond_1
    iget-object p1, p1, Lcc0;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lbc0;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcc0;->a(Lbc0;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object p0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    sget-object v0, Lri5;->c:Lri5;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(FF)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v0, Lui5;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Lui5;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public e(FF)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v0, Lvi5;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Lvi5;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public f(FFFF)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v0, Lfj5;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p3, p4}, Lfj5;-><init>(FFFF)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g(Ll49;)Lxe2;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, Lw21;

    .line 27
    .line 28
    invoke-interface {v2, p1}, Lw21;->c(Ll49;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v1, 0xa

    .line 41
    .line 42
    invoke-static {v0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lw21;

    .line 64
    .line 65
    iget-object v2, p1, Ll49;->j:Lp31;

    .line 66
    .line 67
    invoke-interface {v1, v2}, Lw21;->b(Lp31;)Lpd0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const/4 p1, 0x0

    .line 80
    new-array p1, p1, [Lxe2;

    .line 81
    .line 82
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, [Lxe2;

    .line 87
    .line 88
    new-instance p1, Lj31;

    .line 89
    .line 90
    const/16 v0, 0x9

    .line 91
    .line 92
    invoke-direct {p1, p0, v0}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, Lw51;->t(Lxe2;)Lxe2;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, Lcc0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lbc0;

    .line 40
    .line 41
    invoke-virtual {v1}, Lbc0;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v1, 0xa

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_1
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
