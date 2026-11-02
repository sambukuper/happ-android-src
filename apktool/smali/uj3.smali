.class public abstract Luj3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lv15;

.field public static final b:Lv15;

.field public static final c:Lv15;

.field public static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Luj3;->a:Lv15;

    .line 8
    .line 9
    const-string v0, "allowedTargets"

    .line 10
    .line 11
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Luj3;->b:Lv15;

    .line 16
    .line 17
    const-string v0, "value"

    .line 18
    .line 19
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Luj3;->c:Lv15;

    .line 24
    .line 25
    sget-object v0, Ltg7;->t:Lfk2;

    .line 26
    .line 27
    sget-object v1, Lks3;->c:Lfk2;

    .line 28
    .line 29
    new-instance v2, Lqg5;

    .line 30
    .line 31
    invoke-direct {v2, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Ltg7;->w:Lfk2;

    .line 35
    .line 36
    sget-object v1, Lks3;->d:Lfk2;

    .line 37
    .line 38
    new-instance v3, Lqg5;

    .line 39
    .line 40
    invoke-direct {v3, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Ltg7;->x:Lfk2;

    .line 44
    .line 45
    sget-object v1, Lks3;->f:Lfk2;

    .line 46
    .line 47
    new-instance v4, Lqg5;

    .line 48
    .line 49
    invoke-direct {v4, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v2, v3, v4}, [Lqg5;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lzp4;->J([Lqg5;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Luj3;->d:Ljava/util/Map;

    .line 61
    .line 62
    return-void
.end method

.method public static a(Lfk2;Lvj3;Lz47;)Lpr5;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Ltg7;->m:Lfk2;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object v0, Lks3;->e:Lfk2;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Lvj3;->a(Lfk2;)Lja6;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p0, Ldk3;

    .line 31
    .line 32
    invoke-direct {p0, v0, p2}, Ldk3;-><init>(Lja6;Lz47;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    :goto_0
    sget-object v0, Luj3;->d:Ljava/util/Map;

    .line 37
    .line 38
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lfk2;

    .line 43
    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-interface {p1, p0}, Lvj3;->a(Lfk2;)Lja6;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-static {p0, p2, p1}, Luj3;->b(Lja6;Lz47;Z)Lpr5;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method

.method public static b(Lja6;Lz47;Z)Lpr5;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lja6;->a:Ljava/lang/annotation/Annotation;

    .line 5
    .line 6
    invoke-static {v0}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lia6;->a(Ljava/lang/Class;)Lqs0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lks3;->c:Lfk2;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, Lqs0;

    .line 24
    .line 25
    invoke-virtual {v1}, Lfk2;->b()Lfk2;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v1, v1, Lfk2;->a:Lgk2;

    .line 30
    .line 31
    invoke-virtual {v1}, Lgk2;->g()Lv15;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v2, v3, v1}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lqs0;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    new-instance p2, Lil3;

    .line 45
    .line 46
    invoke-direct {p2, p0, p1}, Lil3;-><init>(Lja6;Lz47;)V

    .line 47
    .line 48
    .line 49
    return-object p2

    .line 50
    :cond_0
    sget-object v1, Lks3;->d:Lfk2;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v2, Lqs0;

    .line 56
    .line 57
    invoke-virtual {v1}, Lfk2;->b()Lfk2;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget-object v1, v1, Lfk2;->a:Lgk2;

    .line 62
    .line 63
    invoke-virtual {v1}, Lgk2;->g()Lv15;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-direct {v2, v3, v1}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2}, Lqs0;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    new-instance p2, Lhl3;

    .line 77
    .line 78
    invoke-direct {p2, p0, p1}, Lhl3;-><init>(Lja6;Lz47;)V

    .line 79
    .line 80
    .line 81
    return-object p2

    .line 82
    :cond_1
    sget-object v1, Lks3;->f:Lfk2;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v2, Lqs0;

    .line 88
    .line 89
    invoke-virtual {v1}, Lfk2;->b()Lfk2;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iget-object v1, v1, Lfk2;->a:Lgk2;

    .line 94
    .line 95
    invoke-virtual {v1}, Lgk2;->g()Lv15;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v2, v3, v1}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, Lqs0;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    new-instance p2, Ltj3;

    .line 109
    .line 110
    sget-object v0, Ltg7;->x:Lfk2;

    .line 111
    .line 112
    invoke-direct {p2, p1, p0, v0}, Ltj3;-><init>(Lz47;Lja6;Lfk2;)V

    .line 113
    .line 114
    .line 115
    return-object p2

    .line 116
    :cond_2
    sget-object v1, Lks3;->e:Lfk2;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v2, Lqs0;

    .line 122
    .line 123
    invoke-virtual {v1}, Lfk2;->b()Lfk2;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget-object v1, v1, Lfk2;->a:Lgk2;

    .line 128
    .line 129
    invoke-virtual {v1}, Lgk2;->g()Lv15;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v2, v3, v1}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v2}, Lqs0;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_3

    .line 141
    .line 142
    const/4 p0, 0x0

    .line 143
    return-object p0

    .line 144
    :cond_3
    new-instance v0, Lm44;

    .line 145
    .line 146
    invoke-direct {v0, p0, p1, p2}, Lm44;-><init>(Lja6;Lz47;Z)V

    .line 147
    .line 148
    .line 149
    return-object v0
.end method
