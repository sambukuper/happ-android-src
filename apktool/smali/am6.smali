.class public final Lam6;
.super Landroid/view/OrientationEventListener;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Ldm6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldm6;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lam6;->a:Ldm6;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onOrientationChanged(I)V
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_5

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Lam6;->a:Ldm6;

    .line 7
    .line 8
    iget v2, v1, Ldm6;->d:I

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x3

    .line 13
    const/4 v6, 0x0

    .line 14
    if-ne v2, v0, :cond_5

    .line 15
    .line 16
    const/16 v0, 0x2d

    .line 17
    .line 18
    if-ltz p1, :cond_2

    .line 19
    .line 20
    if-ge p1, v0, :cond_2

    .line 21
    .line 22
    :cond_1
    :goto_0
    move v3, v6

    .line 23
    goto :goto_4

    .line 24
    :cond_2
    const/16 v1, 0x87

    .line 25
    .line 26
    if-gt v0, p1, :cond_3

    .line 27
    .line 28
    if-ge p1, v1, :cond_3

    .line 29
    .line 30
    :goto_1
    move v3, v5

    .line 31
    goto :goto_4

    .line 32
    :cond_3
    const/16 v0, 0xe1

    .line 33
    .line 34
    if-gt v1, p1, :cond_4

    .line 35
    .line 36
    if-ge p1, v0, :cond_4

    .line 37
    .line 38
    :goto_2
    move v3, v4

    .line 39
    goto :goto_4

    .line 40
    :cond_4
    if-gt v0, p1, :cond_1

    .line 41
    .line 42
    const/16 v0, 0x13b

    .line 43
    .line 44
    if-ge p1, v0, :cond_1

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_5
    if-ltz p1, :cond_6

    .line 48
    .line 49
    const/16 v0, 0x28

    .line 50
    .line 51
    if-ge p1, v0, :cond_6

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_6
    const/16 v0, 0x140

    .line 55
    .line 56
    if-gt v0, p1, :cond_7

    .line 57
    .line 58
    const/16 v0, 0x168

    .line 59
    .line 60
    if-ge p1, v0, :cond_7

    .line 61
    .line 62
    :goto_3
    goto :goto_0

    .line 63
    :cond_7
    const/16 v0, 0x32

    .line 64
    .line 65
    if-gt v0, p1, :cond_8

    .line 66
    .line 67
    const/16 v0, 0x82

    .line 68
    .line 69
    if-ge p1, v0, :cond_8

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_8
    const/16 v0, 0x8c

    .line 73
    .line 74
    if-gt v0, p1, :cond_9

    .line 75
    .line 76
    const/16 v0, 0xdc

    .line 77
    .line 78
    if-ge p1, v0, :cond_9

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_9
    const/16 v0, 0xe6

    .line 82
    .line 83
    if-gt v0, p1, :cond_a

    .line 84
    .line 85
    const/16 v0, 0x136

    .line 86
    .line 87
    if-ge p1, v0, :cond_a

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_a
    iget v3, v1, Ldm6;->d:I

    .line 91
    .line 92
    :goto_4
    iget-object p0, p0, Lam6;->a:Ldm6;

    .line 93
    .line 94
    iget p1, p0, Ldm6;->d:I

    .line 95
    .line 96
    if-eq p1, v3, :cond_c

    .line 97
    .line 98
    iput v3, p0, Ldm6;->d:I

    .line 99
    .line 100
    iget-object p1, p0, Ldm6;->a:Ljava/lang/Object;

    .line 101
    .line 102
    monitor-enter p1

    .line 103
    :try_start_0
    iget-object p0, p0, Ldm6;->c:Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Ljava/lang/Iterable;

    .line 110
    .line 111
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    monitor-exit p1

    .line 116
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_b

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Lcm6;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const/4 p0, 0x0

    .line 137
    throw p0

    .line 138
    :catchall_0
    move-exception p0

    .line 139
    monitor-exit p1

    .line 140
    throw p0

    .line 141
    :cond_c
    :goto_5
    return-void
.end method
