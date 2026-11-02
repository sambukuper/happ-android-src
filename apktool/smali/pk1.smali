.class public final Lpk1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final c:Lra;

.field public static d:I = 0x1

.field public static final e:I

.field public static final f:I

.field public static final g:I

.field public static final h:I

.field public static final i:I

.field public static final j:I

.field public static final k:I

.field public static final l:I

.field public static final m:Lpk1;

.field public static final n:Lpk1;

.field public static final o:Lpk1;

.field public static final p:Lpk1;

.field public static final q:Lpk1;

.field public static final r:Lvz7;

.field public static final s:Lvz7;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lra;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lra;-><init>(BZ)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lpk1;->c:Lra;

    .line 10
    .line 11
    invoke-static {}, Lra;->k()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Lpk1;->e:I

    .line 16
    .line 17
    invoke-static {}, Lra;->k()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sput v1, Lpk1;->f:I

    .line 22
    .line 23
    invoke-static {}, Lra;->k()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sput v2, Lpk1;->g:I

    .line 28
    .line 29
    invoke-static {}, Lra;->k()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    sput v3, Lpk1;->h:I

    .line 34
    .line 35
    invoke-static {}, Lra;->k()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    sput v4, Lpk1;->i:I

    .line 40
    .line 41
    invoke-static {}, Lra;->k()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    sput v5, Lpk1;->j:I

    .line 46
    .line 47
    invoke-static {}, Lra;->k()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    add-int/lit8 v6, v6, -0x1

    .line 52
    .line 53
    sput v6, Lpk1;->k:I

    .line 54
    .line 55
    or-int v7, v0, v1

    .line 56
    .line 57
    or-int/2addr v7, v2

    .line 58
    sput v7, Lpk1;->l:I

    .line 59
    .line 60
    or-int v8, v1, v4

    .line 61
    .line 62
    or-int/2addr v8, v5

    .line 63
    or-int v9, v4, v5

    .line 64
    .line 65
    new-instance v10, Lpk1;

    .line 66
    .line 67
    invoke-direct {v10, v6}, Lpk1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    sput-object v10, Lpk1;->m:Lpk1;

    .line 71
    .line 72
    new-instance v6, Lpk1;

    .line 73
    .line 74
    invoke-direct {v6, v9}, Lpk1;-><init>(I)V

    .line 75
    .line 76
    .line 77
    sput-object v6, Lpk1;->n:Lpk1;

    .line 78
    .line 79
    new-instance v6, Lpk1;

    .line 80
    .line 81
    invoke-direct {v6, v0}, Lpk1;-><init>(I)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lpk1;

    .line 85
    .line 86
    invoke-direct {v0, v1}, Lpk1;-><init>(I)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Lpk1;

    .line 90
    .line 91
    invoke-direct {v0, v2}, Lpk1;-><init>(I)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lpk1;

    .line 95
    .line 96
    invoke-direct {v0, v7}, Lpk1;-><init>(I)V

    .line 97
    .line 98
    .line 99
    sput-object v0, Lpk1;->o:Lpk1;

    .line 100
    .line 101
    new-instance v0, Lpk1;

    .line 102
    .line 103
    invoke-direct {v0, v3}, Lpk1;-><init>(I)V

    .line 104
    .line 105
    .line 106
    new-instance v0, Lpk1;

    .line 107
    .line 108
    invoke-direct {v0, v4}, Lpk1;-><init>(I)V

    .line 109
    .line 110
    .line 111
    sput-object v0, Lpk1;->p:Lpk1;

    .line 112
    .line 113
    new-instance v0, Lpk1;

    .line 114
    .line 115
    invoke-direct {v0, v5}, Lpk1;-><init>(I)V

    .line 116
    .line 117
    .line 118
    sput-object v0, Lpk1;->q:Lpk1;

    .line 119
    .line 120
    new-instance v0, Lpk1;

    .line 121
    .line 122
    invoke-direct {v0, v8}, Lpk1;-><init>(I)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Ltz;->i0:Ltz;

    .line 126
    .line 127
    new-instance v1, Lvz7;

    .line 128
    .line 129
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 130
    .line 131
    .line 132
    sput-object v1, Lpk1;->r:Lvz7;

    .line 133
    .line 134
    sget-object v0, Ltz;->j0:Ltz;

    .line 135
    .line 136
    new-instance v1, Lvz7;

    .line 137
    .line 138
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 139
    .line 140
    .line 141
    sput-object v1, Lpk1;->s:Lvz7;

    .line 142
    .line 143
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 1

    .line 35
    sget-object v0, Ld02;->X:Ld02;

    .line 36
    invoke-direct {p0, p1, v0}, Lpk1;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lpk1;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lnk1;

    .line 24
    .line 25
    invoke-virtual {v0}, Lnk1;->a()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    not-int v0, v0

    .line 30
    and-int/2addr p1, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput p1, p0, Lpk1;->b:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lpk1;->b:I

    .line 2
    .line 3
    and-int/2addr p0, p1

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, Lpk1;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, Lpk1;

    .line 27
    .line 28
    iget-object v1, p0, Lpk1;->a:Ljava/util/List;

    .line 29
    .line 30
    iget-object v3, p1, Lpk1;->a:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    iget p0, p0, Lpk1;->b:I

    .line 40
    .line 41
    iget p1, p1, Lpk1;->b:I

    .line 42
    .line 43
    if-eq p0, p1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lpk1;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget p0, p0, Lpk1;->b:I

    .line 10
    .line 11
    add-int/2addr v0, p0

    .line 12
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, Lpk1;->r:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v3, v1

    .line 25
    check-cast v3, Lok1;

    .line 26
    .line 27
    iget v3, v3, Lok1;->a:I

    .line 28
    .line 29
    iget v4, p0, Lpk1;->b:I

    .line 30
    .line 31
    if-ne v3, v4, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, v2

    .line 35
    :goto_0
    check-cast v1, Lok1;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v0, v1, Lok1;->b:Ljava/lang/String;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v0, v2

    .line 43
    :goto_1
    if-nez v0, :cond_6

    .line 44
    .line 45
    sget-object v0, Lpk1;->s:Lvz7;

    .line 46
    .line 47
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/util/List;

    .line 52
    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lok1;

    .line 73
    .line 74
    iget v4, v1, Lok1;->a:I

    .line 75
    .line 76
    invoke-virtual {p0, v4}, Lpk1;->a(I)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    iget-object v1, v1, Lok1;->b:Ljava/lang/String;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object v1, v2

    .line 86
    :goto_3
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    const/4 v7, 0x0

    .line 93
    const/16 v8, 0x3e

    .line 94
    .line 95
    const-string v4, " | "

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    const/4 v6, 0x0

    .line 99
    invoke-static/range {v3 .. v8}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_6
    const-string v1, "DescriptorKindFilter("

    .line 104
    .line 105
    const-string v2, ", "

    .line 106
    .line 107
    invoke-static {v1, v0, v2}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object p0, p0, Lpk1;->a:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 p0, 0x29

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method
