.class public final Ld97;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;

.field public c:Lqg5;


# direct methods
.method public constructor <init>(Lxd6;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ld97;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ld97;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance p1, Lqg5;

    .line 14
    .line 15
    const-string p2, "V"

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-direct {p1, p2, p3}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ld97;->c:Lqg5;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final varargs a(Ljava/lang/String;[Lql3;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p2

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    new-instance v0, Lgu;

    .line 10
    .line 11
    new-instance v1, Lo7;

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    invoke-direct {v1, p2, v2}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-direct {v0, v1, p2}, Lgu;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    const/16 p2, 0xa

    .line 23
    .line 24
    invoke-static {v0, p2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-static {p2}, Laq4;->G(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/16 v1, 0x10

    .line 33
    .line 34
    if-ge p2, v1, :cond_1

    .line 35
    .line 36
    move p2, v1

    .line 37
    :cond_1
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-direct {v1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lgu;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    :goto_0
    move-object v0, p2

    .line 47
    check-cast v0, Lrw1;

    .line 48
    .line 49
    iget-object v2, v0, Lrw1;->Y:Ljava/util/Iterator;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, Lrw1;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lpb3;

    .line 62
    .line 63
    iget v2, v0, Lpb3;->a:I

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v0, v0, Lpb3;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lql3;

    .line 72
    .line 73
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance p2, Lrh8;

    .line 78
    .line 79
    invoke-direct {p2, v1}, Lrh8;-><init>(Ljava/util/LinkedHashMap;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    new-instance v0, Lqg5;

    .line 83
    .line 84
    invoke-direct {v0, p1, p2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, Ld97;->b:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final b(Lut3;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lut3;->Z:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v0, Lqg5;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ld97;->c:Lqg5;

    .line 13
    .line 14
    return-void
.end method

.method public final varargs c(Ljava/lang/String;[Lql3;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lgu;

    .line 5
    .line 6
    new-instance v1, Lo7;

    .line 7
    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    invoke-direct {v1, p2, v2}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-direct {v0, v1, p2}, Lgu;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    const/16 p2, 0xa

    .line 18
    .line 19
    invoke-static {v0, p2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-static {p2}, Laq4;->G(I)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/16 v1, 0x10

    .line 28
    .line 29
    if-ge p2, v1, :cond_0

    .line 30
    .line 31
    move p2, v1

    .line 32
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-direct {v1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lgu;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    :goto_0
    move-object v0, p2

    .line 42
    check-cast v0, Lrw1;

    .line 43
    .line 44
    iget-object v2, v0, Lrw1;->Y:Ljava/util/Iterator;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0}, Lrw1;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lpb3;

    .line 57
    .line 58
    iget v2, v0, Lpb3;->a:I

    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v0, v0, Lpb3;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lql3;

    .line 67
    .line 68
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    new-instance p2, Lrh8;

    .line 73
    .line 74
    invoke-direct {p2, v1}, Lrh8;-><init>(Ljava/util/LinkedHashMap;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Lqg5;

    .line 78
    .line 79
    invoke-direct {v0, p1, p2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Ld97;->c:Lqg5;

    .line 83
    .line 84
    return-void
.end method
