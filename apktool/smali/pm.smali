.class public abstract Lpm;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lv15;

.field public static final b:Lv15;

.field public static final c:Lv15;

.field public static final d:Lv15;

.field public static final e:Lv15;


# direct methods
.method static constructor <clinit>()V
    .locals 1

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
    sput-object v0, Lpm;->a:Lv15;

    .line 8
    .line 9
    const-string v0, "replaceWith"

    .line 10
    .line 11
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lpm;->b:Lv15;

    .line 16
    .line 17
    const-string v0, "level"

    .line 18
    .line 19
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lpm;->c:Lv15;

    .line 24
    .line 25
    const-string v0, "expression"

    .line 26
    .line 27
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lpm;->d:Lv15;

    .line 32
    .line 33
    const-string v0, "imports"

    .line 34
    .line 35
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lpm;->e:Lv15;

    .line 40
    .line 41
    return-void
.end method

.method public static final a(Lzz3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lga0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lga0;

    .line 5
    .line 6
    sget-object v1, Ltg7;->o:Lfk2;

    .line 7
    .line 8
    new-instance v2, Lbm7;

    .line 9
    .line 10
    invoke-direct {v2, p2}, Ls21;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Lqg5;

    .line 14
    .line 15
    sget-object v3, Lpm;->d:Lv15;

    .line 16
    .line 17
    invoke-direct {p2, v3, v2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ldu;

    .line 21
    .line 22
    new-instance v3, Lom;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct {v3, p0, v4}, Lom;-><init>(Lzz3;B)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Ld02;->X:Ld02;

    .line 29
    .line 30
    invoke-direct {v2, v4, v3}, Ldu;-><init>(Ljava/util/List;Lgn2;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Lqg5;

    .line 34
    .line 35
    sget-object v4, Lpm;->e:Lv15;

    .line 36
    .line 37
    invoke-direct {v3, v4, v2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    filled-new-array {p2, v3}, [Lqg5;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p2}, Lzp4;->J([Lqg5;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-direct {v0, p0, v1, p2}, Lga0;-><init>(Lzz3;Lfk2;Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Lga0;

    .line 52
    .line 53
    sget-object v1, Ltg7;->m:Lfk2;

    .line 54
    .line 55
    new-instance v2, Lbm7;

    .line 56
    .line 57
    invoke-direct {v2, p1}, Ls21;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lqg5;

    .line 61
    .line 62
    sget-object v3, Lpm;->a:Lv15;

    .line 63
    .line 64
    invoke-direct {p1, v3, v2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lqm;

    .line 68
    .line 69
    invoke-direct {v2, v0}, Ls21;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lqg5;

    .line 73
    .line 74
    sget-object v3, Lpm;->b:Lv15;

    .line 75
    .line 76
    invoke-direct {v0, v3, v2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v2, Lx22;

    .line 80
    .line 81
    sget-object v3, Ltg7;->n:Lfk2;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v4, Lqs0;

    .line 87
    .line 88
    invoke-virtual {v3}, Lfk2;->b()Lfk2;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    iget-object v3, v3, Lfk2;->a:Lgk2;

    .line 93
    .line 94
    invoke-virtual {v3}, Lgk2;->g()Lv15;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-direct {v4, v5, v3}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p3}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    invoke-direct {v2, v4, p3}, Lx22;-><init>(Lqs0;Lv15;)V

    .line 106
    .line 107
    .line 108
    new-instance p3, Lqg5;

    .line 109
    .line 110
    sget-object v3, Lpm;->c:Lv15;

    .line 111
    .line 112
    invoke-direct {p3, v3, v2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    filled-new-array {p1, v0, p3}, [Lqg5;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lzp4;->J([Lqg5;)Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-direct {p2, p0, v1, p1}, Lga0;-><init>(Lzz3;Lfk2;Ljava/util/Map;)V

    .line 124
    .line 125
    .line 126
    return-object p2
.end method
