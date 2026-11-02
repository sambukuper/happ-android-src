.class public final Lzv7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf91;
.implements Lv06;
.implements Lfa5;


# static fields
.field public static f0:Lzv7;


# instance fields
.field public X:Ljava/lang/Object;

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 93
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 94
    iput-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    return-void

    .line 95
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    .line 97
    iput-object p1, p0, Lzv7;->Y:Ljava/lang/Object;

    return-void

    .line 98
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    .line 100
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 101
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lzv7;->Z:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Laj0;Landroid/util/Size;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {p1}, Lxi0;->c()I

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lxi0;->j()I

    .line 10
    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroid/util/Rational;

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-direct {v0, v1, p2}, Landroid/util/Rational;-><init>(II)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 p2, 0x100

    .line 29
    .line 30
    invoke-interface {p1, p2}, Laj0;->t(I)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    move-object v0, p2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-instance v0, Lrx0;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, v1}, Lrx0;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    invoke-static {p2, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Landroid/util/Size;

    .line 54
    .line 55
    new-instance v0, Landroid/util/Rational;

    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-direct {v0, v1, p2}, Landroid/util/Rational;-><init>(II)V

    .line 66
    .line 67
    .line 68
    :goto_0
    iput-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 69
    .line 70
    new-instance p2, Lhx7;

    .line 71
    .line 72
    invoke-direct {p2, p1, v0}, Lhx7;-><init>(Laj0;Landroid/util/Rational;)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    .line 86
    iput-object p2, p0, Lzv7;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldw7;Law7;Lsi3;)V
    .locals 0

    iput-object p1, p0, Lzv7;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p3, p0, Lzv7;->X:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    iput-object p2, p0, Lzv7;->Y:Ljava/lang/Object;

    iput-object p3, p0, Lzv7;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkf3;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    .line 82
    iput-object p2, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 83
    iput-object p3, p0, Lzv7;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lrj8;Lzv7;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    .line 90
    iput-object p2, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 91
    iget-object p1, p1, Lrj8;->X:Ljava/lang/Object;

    .line 92
    iput-object p1, p0, Lzv7;->Z:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lfb9;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide/16 v0, 0x1e

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0, v0, v1}, Lg28;->c(Lfb9;J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Ljava/io/IOException;

    .line 10
    .line 11
    const-string v1, "SERVICE_NOT_AVAILABLE"

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw v0

    .line 17
    :catch_1
    move-exception p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, v0, Ljava/io/IOException;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    check-cast v0, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    throw v0

    .line 33
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_1
    check-cast v0, Ljava/io/IOException;

    .line 40
    .line 41
    throw v0
.end method

.method public static h(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lru;->a:Landroid/util/Rational;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object v1, Lru;->c:Landroid/util/Rational;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/util/Size;

    .line 31
    .line 32
    new-instance v2, Landroid/util/Rational;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-direct {v2, v3, v4}, Landroid/util/Rational;-><init>(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroid/util/Rational;

    .line 66
    .line 67
    invoke-static {v4, v1}, Lru;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    return-object v0
.end method

.method public static l(IZ)Landroid/util/Rational;
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p0, v0, :cond_2

    .line 3
    .line 4
    if-eqz p0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const-string p0, "SupportedOutputSizesCollector"

    .line 10
    .line 11
    invoke-static {p0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    sget-object p0, Lru;->c:Landroid/util/Rational;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Lru;->d:Landroid/util/Rational;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    if-eqz p1, :cond_3

    .line 25
    .line 26
    sget-object p0, Lru;->a:Landroid/util/Rational;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    sget-object p0, Lru;->b:Landroid/util/Rational;

    .line 30
    .line 31
    return-object p0
.end method

.method public static m(Ljava/util/ArrayList;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lzv7;->h(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/util/Rational;

    .line 25
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroid/util/Size;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Landroid/util/Rational;

    .line 70
    .line 71
    invoke-static {v3, v1}, Lru;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    return-object v0
.end method

.method public static r(IILandroid/content/Context;Landroid/util/AttributeSet;[I)Lzv7;
    .locals 1

    .line 1
    new-instance v0, Lzv7;

    .line 2
    .line 3
    invoke-virtual {p2, p3, p4, p0, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p2, p0}, Lzv7;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static x(Ljava/util/List;Landroid/util/Size;Z)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    :goto_0
    if-ltz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroid/util/Size;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-lt v3, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ge v3, v4, :cond_1

    .line 39
    .line 40
    :cond_0
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v0, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v1, v1, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-interface {p0, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    invoke-interface {p0, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public static y(Ljava/util/List;Landroid/util/Size;Z)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Landroid/util/Size;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-gt v4, v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-le v4, v5, :cond_1

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-interface {p0, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-interface {p0, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method


# virtual methods
.method public b(Lxx7;Ljava/util/Map$Entry;)V
    .locals 9

    .line 1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Lxx7;

    .line 7
    .line 8
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    const-string v0, "SurfaceProcessorNode"

    .line 12
    .line 13
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, Lxx7;->g:Liz;

    .line 17
    .line 18
    iget-object v4, v0, Liz;->a:Landroid/util/Size;

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lxy;

    .line 25
    .line 26
    iget-object v5, v0, Lxy;->d:Landroid/graphics/Rect;

    .line 27
    .line 28
    iget-boolean p1, p1, Lxx7;->c:Z

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lcj0;

    .line 36
    .line 37
    move-object v6, p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v6, v0

    .line 40
    :goto_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lxy;

    .line 45
    .line 46
    iget v7, p1, Lxy;->f:I

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lxy;

    .line 53
    .line 54
    iget-boolean v8, p1, Lxy;->g:Z

    .line 55
    .line 56
    new-instance v3, Ljz;

    .line 57
    .line 58
    invoke-direct/range {v3 .. v8}, Ljz;-><init>(Landroid/util/Size;Landroid/graphics/Rect;Lcj0;IZ)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lxy;

    .line 66
    .line 67
    iget v4, p1, Lxy;->c:I

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Ls08;->b()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Lxx7;->a()V

    .line 76
    .line 77
    .line 78
    iget-boolean p1, v2, Lxx7;->j:Z

    .line 79
    .line 80
    const/4 p2, 0x1

    .line 81
    xor-int/2addr p1, p2

    .line 82
    const-string v1, "Consumer can only be linked once."

    .line 83
    .line 84
    invoke-static {v1, p1}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    iput-boolean p2, v2, Lxx7;->j:Z

    .line 88
    .line 89
    move-object v5, v3

    .line 90
    iget-object v3, v2, Lxx7;->l:Lwx7;

    .line 91
    .line 92
    invoke-virtual {v3}, Lwg1;->c()Lxb4;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance v1, Lux7;

    .line 97
    .line 98
    move-object v6, v0

    .line 99
    invoke-direct/range {v1 .. v6}, Lux7;-><init>(Lxx7;Lwx7;ILjz;Ljz;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p1, v1, p2}, Lvr3;->g0(Lxb4;Lvu;Ljava/util/concurrent/Executor;)Lzo0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    new-instance p2, Lxd6;

    .line 111
    .line 112
    const/16 v0, 0xe

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-direct {p2, v0, p0, v2, v1}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    new-instance v0, Lzo2;

    .line 123
    .line 124
    invoke-direct {v0, p1, p2, v1}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0, p0}, Lyo2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public c(I)Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lw79;->v(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public d()V
    .locals 2

    .line 1
    invoke-static {p0}, Lhi5;->a0(Lf91;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lue3;->y(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lsi3;

    .line 12
    .line 13
    iget-object v1, p0, Lsi3;->h0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lsi3;->s0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lsi3;->r0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lsi3;->o0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lsi3;->f0:Lcom/google/android/material/checkbox/MaterialCheckBox;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lsi3;->w0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lsi3;->v0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public e(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lu70;->O(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public f(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Laq;->a()Laq;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v1, v0, Laq;->a:Lrf6;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v1, p0, p1, v2}, Lrf6;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public g(IILoq;)Landroid/graphics/Typeface;
    .locals 9

    .line 1
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/util/TypedValue;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_1
    move-object v4, p1

    .line 27
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    check-cast v2, Landroid/content/Context;

    .line 31
    .line 32
    sget-object p0, Lxf6;->a:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    :goto_0
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    :cond_2
    const/4 v7, 0x1

    .line 43
    const/4 v8, 0x0

    .line 44
    move v5, p2

    .line 45
    move-object v6, p3

    .line 46
    invoke-static/range {v2 .. v8}, Lxf6;->a(Landroid/content/Context;ILandroid/util/TypedValue;ILwl7;ZZ)Landroid/graphics/Typeface;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public get()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v1, Lf08;

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lf08;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lf08;

    .line 9
    .line 10
    const/16 v0, 0x9

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lf08;-><init>(B)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ly5;

    .line 18
    .line 19
    invoke-virtual {v0}, Ly5;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v3, v0

    .line 24
    check-cast v3, Lof1;

    .line 25
    .line 26
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lxy0;

    .line 29
    .line 30
    invoke-virtual {v0}, Lxy0;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v4, v0

    .line 35
    check-cast v4, Ljl1;

    .line 36
    .line 37
    iget-object p0, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lyr6;

    .line 40
    .line 41
    invoke-virtual {p0}, Lyr6;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    move-object v5, p0

    .line 46
    check-cast v5, Lyr6;

    .line 47
    .line 48
    new-instance v0, Lwe8;

    .line 49
    .line 50
    invoke-direct/range {v0 .. v5}, Lwe8;-><init>(Lf08;Lf08;Lof1;Ljl1;Lyr6;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method public synthetic i(Lfb9;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lzv7;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lyq6;

    .line 4
    .line 5
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/concurrent/ScheduledFuture;

    .line 12
    .line 13
    iget-object p1, p1, Lyq6;->a:Ll97;

    .line 14
    .line 15
    monitor-enter p1

    .line 16
    :try_start_0
    invoke-virtual {p1, v0}, Ll97;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p0
.end method

.method public j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsi3;

    .line 4
    .line 5
    iget-object v1, v0, Lsi3;->h0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 6
    .line 7
    new-instance v2, Lfv7;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, p0, v3}, Lfv7;-><init>(Lzv7;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lsi3;->s0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 17
    .line 18
    new-instance v2, Lfv7;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v2, p0, v3}, Lfv7;-><init>(Lzv7;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, Lsi3;->r0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 28
    .line 29
    new-instance v2, Lfv7;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v2, p0, v3}, Lfv7;-><init>(Lzv7;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lsi3;->o0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 39
    .line 40
    new-instance v2, Lfv7;

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    invoke-direct {v2, p0, v3}, Lfv7;-><init>(Lzv7;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, Lsi3;->f0:Lcom/google/android/material/checkbox/MaterialCheckBox;

    .line 50
    .line 51
    new-instance v2, Lfv7;

    .line 52
    .line 53
    const/4 v3, 0x4

    .line 54
    invoke-direct {v2, p0, v3}, Lfv7;-><init>(Lzv7;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Lsi3;->w0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 61
    .line 62
    new-instance v2, Lfv7;

    .line 63
    .line 64
    const/4 v3, 0x5

    .line 65
    invoke-direct {v2, p0, v3}, Lfv7;-><init>(Lzv7;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Lsi3;->v0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 72
    .line 73
    new-instance v1, Lfv7;

    .line 74
    .line 75
    const/4 v2, 0x6

    .line 76
    invoke-direct {v1, p0, v2}, Lfv7;-><init>(Lzv7;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public k(Ler8;)Ljava/util/ArrayList;
    .locals 12

    .line 1
    iget-object v0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Laj0;

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Li63;

    .line 7
    .line 8
    sget-object v2, Li63;->B:Lzx;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-interface {v1, v2, v3}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    new-instance v4, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v4, v3

    .line 26
    :goto_0
    if-eqz v4, :cond_1

    .line 27
    .line 28
    return-object v4

    .line 29
    :cond_1
    sget-object v2, Li63;->A:Lzx;

    .line 30
    .line 31
    invoke-interface {v1, v2, v3}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lef6;

    .line 36
    .line 37
    sget-object v4, Li63;->z:Lzx;

    .line 38
    .line 39
    invoke-interface {v1, v4, v3}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {p1}, Le63;->n()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Landroid/util/Pair;

    .line 66
    .line 67
    iget-object v7, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-ne v7, v5, :cond_2

    .line 76
    .line 77
    iget-object v4, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, [Landroid/util/Size;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move-object v4, v3

    .line 83
    :goto_1
    if-nez v4, :cond_4

    .line 84
    .line 85
    move-object v4, v3

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    :goto_2
    if-nez v4, :cond_5

    .line 92
    .line 93
    invoke-interface {v0, v5}, Laj0;->t(I)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 100
    .line 101
    .line 102
    new-instance v4, Lrx0;

    .line 103
    .line 104
    const/4 v5, 0x1

    .line 105
    invoke-direct {v4, v5}, Lrx0;-><init>(Z)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    const-string v6, "SupportedOutputSizesCollector"

    .line 116
    .line 117
    if-eqz v4, :cond_6

    .line 118
    .line 119
    invoke-static {v6}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    :cond_6
    const/4 v4, 0x0

    .line 123
    if-nez v2, :cond_19

    .line 124
    .line 125
    iget-object p0, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Lhx7;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_7

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Lrx0;

    .line 142
    .line 143
    invoke-direct {v0, v5}, Lrx0;-><init>(Z)V

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 147
    .line 148
    .line 149
    new-instance v0, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    check-cast p1, Li63;

    .line 155
    .line 156
    sget-object v2, Li63;->y:Lzx;

    .line 157
    .line 158
    invoke-interface {p1, v2, v3}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    check-cast v2, Landroid/util/Size;

    .line 163
    .line 164
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    check-cast v4, Landroid/util/Size;

    .line 169
    .line 170
    if-eqz v2, :cond_8

    .line 171
    .line 172
    invoke-static {v4}, Lcb7;->a(Landroid/util/Size;)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    mul-int/2addr v8, v7

    .line 185
    if-ge v6, v8, :cond_9

    .line 186
    .line 187
    :cond_8
    move-object v2, v4

    .line 188
    :cond_9
    invoke-virtual {p0, p1}, Lhx7;->a(Li63;)Landroid/util/Size;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    sget-object v6, Lcb7;->b:Landroid/util/Size;

    .line 193
    .line 194
    invoke-static {v6}, Lcb7;->a(Landroid/util/Size;)I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    invoke-static {v2}, Lcb7;->a(Landroid/util/Size;)I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-ge v8, v7, :cond_a

    .line 203
    .line 204
    sget-object v6, Lcb7;->a:Landroid/util/Size;

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_a
    if-eqz v4, :cond_b

    .line 208
    .line 209
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    mul-int/2addr v9, v8

    .line 218
    if-ge v9, v7, :cond_b

    .line 219
    .line 220
    move-object v6, v4

    .line 221
    :cond_b
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    :cond_c
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-eqz v8, :cond_d

    .line 230
    .line 231
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    check-cast v8, Landroid/util/Size;

    .line 236
    .line 237
    invoke-static {v8}, Lcb7;->a(Landroid/util/Size;)I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    mul-int/2addr v11, v10

    .line 250
    if-gt v9, v11, :cond_c

    .line 251
    .line 252
    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    .line 253
    .line 254
    .line 255
    move-result v9

    .line 256
    invoke-virtual {v8}, Landroid/util/Size;->getHeight()I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    mul-int/2addr v10, v9

    .line 261
    invoke-static {v6}, Lcb7;->a(Landroid/util/Size;)I

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-lt v10, v9, :cond_c

    .line 266
    .line 267
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    if-nez v9, :cond_c

    .line 272
    .line 273
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-nez v7, :cond_18

    .line 282
    .line 283
    sget-object v1, Li63;->s:Lzx;

    .line 284
    .line 285
    invoke-interface {p1, v1}, Lb76;->h(Lzx;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_e

    .line 290
    .line 291
    invoke-interface {p1, v1}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    check-cast v1, Ljava/lang/Integer;

    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    iget-boolean v2, p0, Lhx7;->d:Z

    .line 302
    .line 303
    invoke-static {v1, v2}, Lzv7;->l(IZ)Landroid/util/Rational;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    goto :goto_5

    .line 308
    :cond_e
    invoke-virtual {p0, p1}, Lhx7;->a(Li63;)Landroid/util/Size;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    if-eqz v1, :cond_11

    .line 313
    .line 314
    invoke-static {v0}, Lzv7;->h(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    :cond_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-eqz v6, :cond_10

    .line 327
    .line 328
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    check-cast v6, Landroid/util/Rational;

    .line 333
    .line 334
    invoke-static {v6, v1}, Lru;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-eqz v7, :cond_f

    .line 339
    .line 340
    move-object v1, v6

    .line 341
    goto :goto_5

    .line 342
    :cond_10
    new-instance v2, Landroid/util/Rational;

    .line 343
    .line 344
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 345
    .line 346
    .line 347
    move-result v6

    .line 348
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    invoke-direct {v2, v6, v1}, Landroid/util/Rational;-><init>(II)V

    .line 353
    .line 354
    .line 355
    move-object v1, v2

    .line 356
    goto :goto_5

    .line 357
    :cond_11
    move-object v1, v3

    .line 358
    :goto_5
    if-nez v4, :cond_12

    .line 359
    .line 360
    sget-object v2, Li63;->x:Lzx;

    .line 361
    .line 362
    invoke-interface {p1, v2, v3}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    move-object v4, p1

    .line 367
    check-cast v4, Landroid/util/Size;

    .line 368
    .line 369
    :cond_12
    new-instance p1, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 372
    .line 373
    .line 374
    new-instance v2, Ljava/util/HashMap;

    .line 375
    .line 376
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 377
    .line 378
    .line 379
    if-nez v1, :cond_13

    .line 380
    .line 381
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 382
    .line 383
    .line 384
    if-eqz v4, :cond_17

    .line 385
    .line 386
    invoke-static {p1, v4, v5}, Lzv7;->x(Ljava/util/List;Landroid/util/Size;Z)V

    .line 387
    .line 388
    .line 389
    return-object p1

    .line 390
    :cond_13
    invoke-static {v0}, Lzv7;->m(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-eqz v4, :cond_14

    .line 395
    .line 396
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-eqz v3, :cond_14

    .line 409
    .line 410
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    check-cast v3, Landroid/util/Rational;

    .line 415
    .line 416
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    check-cast v3, Ljava/util/List;

    .line 421
    .line 422
    invoke-static {v3, v4, v5}, Lzv7;->x(Ljava/util/List;Landroid/util/Size;Z)V

    .line 423
    .line 424
    .line 425
    goto :goto_6

    .line 426
    :cond_14
    new-instance v2, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 433
    .line 434
    .line 435
    new-instance v3, Lqu;

    .line 436
    .line 437
    iget-object p0, p0, Lhx7;->c:Landroid/util/Rational;

    .line 438
    .line 439
    invoke-direct {v3, v1, p0}, Lqu;-><init>(Landroid/util/Rational;Landroid/util/Rational;)V

    .line 440
    .line 441
    .line 442
    invoke-static {v2, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    :cond_15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-eqz v1, :cond_17

    .line 454
    .line 455
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    check-cast v1, Landroid/util/Rational;

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    check-cast v1, Ljava/util/List;

    .line 466
    .line 467
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    :cond_16
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_15

    .line 476
    .line 477
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    check-cast v2, Landroid/util/Size;

    .line 482
    .line 483
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    if-nez v3, :cond_16

    .line 488
    .line 489
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    goto :goto_7

    .line 493
    :cond_17
    return-object p1

    .line 494
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 495
    .line 496
    new-instance p1, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    const-string v0, "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "

    .line 499
    .line 500
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    const-string v0, "\nmaxSize = "

    .line 507
    .line 508
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-string v0, "\ninitial size list: "

    .line 515
    .line 516
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    throw p0

    .line 530
    :cond_19
    move-object v2, p1

    .line 531
    check-cast v2, Li63;

    .line 532
    .line 533
    sget-object v7, Li63;->y:Lzx;

    .line 534
    .line 535
    invoke-interface {v2, v7, v3}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    check-cast v2, Landroid/util/Size;

    .line 540
    .line 541
    invoke-interface {v1, v4}, Li63;->H(I)I

    .line 542
    .line 543
    .line 544
    sget-object v3, Ler8;->V:Lzx;

    .line 545
    .line 546
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 547
    .line 548
    invoke-interface {p1, v3, v7}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    check-cast v3, Ljava/lang/Boolean;

    .line 553
    .line 554
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    if-nez v3, :cond_1a

    .line 559
    .line 560
    invoke-interface {p1}, Le63;->n()I

    .line 561
    .line 562
    .line 563
    :cond_1a
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    invoke-static {v6}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    sget-object p1, Li63;->A:Lzx;

    .line 573
    .line 574
    invoke-interface {v1, p1}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    check-cast p1, Lef6;

    .line 579
    .line 580
    iget-object p0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast p0, Landroid/util/Rational;

    .line 583
    .line 584
    iget-object v1, p1, Lef6;->a:Lpz2;

    .line 585
    .line 586
    invoke-static {v0}, Lzv7;->m(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    if-eqz p0, :cond_1b

    .line 591
    .line 592
    invoke-virtual {p0}, Landroid/util/Rational;->getNumerator()I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    invoke-virtual {p0}, Landroid/util/Rational;->getDenominator()I

    .line 597
    .line 598
    .line 599
    move-result v6

    .line 600
    if-lt v3, v6, :cond_1c

    .line 601
    .line 602
    :cond_1b
    move v3, v5

    .line 603
    goto :goto_8

    .line 604
    :cond_1c
    move v3, v4

    .line 605
    :goto_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    invoke-static {v4, v3}, Lzv7;->l(IZ)Landroid/util/Rational;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    new-instance v3, Ljava/util/ArrayList;

    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 615
    .line 616
    .line 617
    move-result-object v6

    .line 618
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 619
    .line 620
    .line 621
    new-instance v6, Lqu;

    .line 622
    .line 623
    invoke-direct {v6, v1, p0}, Lqu;-><init>(Landroid/util/Rational;Landroid/util/Rational;)V

    .line 624
    .line 625
    .line 626
    invoke-static {v3, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 627
    .line 628
    .line 629
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 630
    .line 631
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    if-eqz v3, :cond_1d

    .line 643
    .line 644
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    check-cast v3, Landroid/util/Rational;

    .line 649
    .line 650
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v6

    .line 654
    check-cast v6, Ljava/util/List;

    .line 655
    .line 656
    invoke-virtual {p0, v3, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    goto :goto_9

    .line 660
    :cond_1d
    if-eqz v2, :cond_20

    .line 661
    .line 662
    sget-object v0, Lcb7;->a:Landroid/util/Size;

    .line 663
    .line 664
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 665
    .line 666
    .line 667
    move-result v0

    .line 668
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    mul-int/2addr v1, v0

    .line 673
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    if-eqz v2, :cond_20

    .line 686
    .line 687
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    check-cast v2, Landroid/util/Rational;

    .line 692
    .line 693
    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    check-cast v2, Ljava/util/List;

    .line 698
    .line 699
    new-instance v3, Ljava/util/ArrayList;

    .line 700
    .line 701
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 702
    .line 703
    .line 704
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 705
    .line 706
    .line 707
    move-result-object v6

    .line 708
    :cond_1e
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    if-eqz v7, :cond_1f

    .line 713
    .line 714
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v7

    .line 718
    check-cast v7, Landroid/util/Size;

    .line 719
    .line 720
    invoke-static {v7}, Lcb7;->a(Landroid/util/Size;)I

    .line 721
    .line 722
    .line 723
    move-result v8

    .line 724
    if-gt v8, v1, :cond_1e

    .line 725
    .line 726
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    goto :goto_b

    .line 730
    :cond_1f
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 731
    .line 732
    .line 733
    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 734
    .line 735
    .line 736
    goto :goto_a

    .line 737
    :cond_20
    iget-object p1, p1, Lef6;->b:Lff6;

    .line 738
    .line 739
    if-nez p1, :cond_21

    .line 740
    .line 741
    goto :goto_d

    .line 742
    :cond_21
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    :cond_22
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    if-eqz v1, :cond_29

    .line 755
    .line 756
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    check-cast v1, Landroid/util/Rational;

    .line 761
    .line 762
    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    check-cast v1, Ljava/util/List;

    .line 767
    .line 768
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    if-eqz v2, :cond_23

    .line 773
    .line 774
    goto :goto_c

    .line 775
    :cond_23
    iget-boolean v2, p1, Lff6;->b:Z

    .line 776
    .line 777
    sget-object v3, Lff6;->c:Lff6;

    .line 778
    .line 779
    if-eq p1, v3, :cond_22

    .line 780
    .line 781
    iget-object v3, p1, Lff6;->a:Landroid/util/Size;

    .line 782
    .line 783
    if-eqz v2, :cond_28

    .line 784
    .line 785
    if-eq v2, v5, :cond_27

    .line 786
    .line 787
    const/4 v6, 0x2

    .line 788
    if-eq v2, v6, :cond_26

    .line 789
    .line 790
    const/4 v6, 0x3

    .line 791
    if-eq v2, v6, :cond_25

    .line 792
    .line 793
    const/4 v6, 0x4

    .line 794
    if-eq v2, v6, :cond_24

    .line 795
    .line 796
    goto :goto_c

    .line 797
    :cond_24
    invoke-static {v1, v3, v4}, Lzv7;->y(Ljava/util/List;Landroid/util/Size;Z)V

    .line 798
    .line 799
    .line 800
    goto :goto_c

    .line 801
    :cond_25
    invoke-static {v1, v3, v5}, Lzv7;->y(Ljava/util/List;Landroid/util/Size;Z)V

    .line 802
    .line 803
    .line 804
    goto :goto_c

    .line 805
    :cond_26
    invoke-static {v1, v3, v4}, Lzv7;->x(Ljava/util/List;Landroid/util/Size;Z)V

    .line 806
    .line 807
    .line 808
    goto :goto_c

    .line 809
    :cond_27
    invoke-static {v1, v3, v5}, Lzv7;->x(Ljava/util/List;Landroid/util/Size;Z)V

    .line 810
    .line 811
    .line 812
    goto :goto_c

    .line 813
    :cond_28
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v2

    .line 817
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 818
    .line 819
    .line 820
    if-eqz v2, :cond_22

    .line 821
    .line 822
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    goto :goto_c

    .line 826
    :cond_29
    :goto_d
    new-instance p1, Ljava/util/ArrayList;

    .line 827
    .line 828
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 829
    .line 830
    .line 831
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 832
    .line 833
    .line 834
    move-result-object p0

    .line 835
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 836
    .line 837
    .line 838
    move-result-object p0

    .line 839
    :cond_2a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    if-eqz v0, :cond_2c

    .line 844
    .line 845
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    check-cast v0, Ljava/util/List;

    .line 850
    .line 851
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    :cond_2b
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    if-eqz v1, :cond_2a

    .line 860
    .line 861
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    check-cast v1, Landroid/util/Size;

    .line 866
    .line 867
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v2

    .line 871
    if-nez v2, :cond_2b

    .line 872
    .line 873
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    goto :goto_e

    .line 877
    :cond_2c
    return-object p1
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsi3;

    .line 4
    .line 5
    iget-object v0, p0, Lsi3;->j0:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lsi3;->l0:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lsi3;->v0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsi3;

    .line 4
    .line 5
    iget-object v0, p0, Lsi3;->j0:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lsi3;->l0:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lsi3;->w0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public p()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llh7;

    .line 4
    .line 5
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lzv7;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lzv7;->p()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsi3;

    .line 4
    .line 5
    return-object p0
.end method

.method public s()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldw7;

    .line 4
    .line 5
    iget-object v0, v0, Ldw7;->n:Lck4;

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object p0, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Law7;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    iget-object v1, v0, Lck4;->X:Lb6;

    .line 18
    .line 19
    iget-object v2, v1, Lb6;->A0:Landroid/view/View;

    .line 20
    .line 21
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    add-int/lit8 v3, p0, 0x1

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    invoke-static {v0, p0}, Lck4;->a(Lck4;I)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    instance-of v3, v2, Lyv7;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    check-cast v2, Lyv7;

    .line 41
    .line 42
    iget-object p0, v2, Lyv7;->v:Lf63;

    .line 43
    .line 44
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lc6;

    .line 47
    .line 48
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iget-object v1, v1, Lb6;->A0:Landroid/view/View;

    .line 58
    .line 59
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    add-int/lit8 v2, p0, 0x2

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    instance-of v2, v1, Law7;

    .line 68
    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    check-cast v1, Law7;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    const/4 v1, 0x0

    .line 75
    :goto_0
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget-object v1, v1, Law7;->w:Lzv7;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    iget-object p0, v1, Lzv7;->X:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Lsi3;

    .line 84
    .line 85
    iget-object p0, p0, Lsi3;->h0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-static {v0, p0}, Lck4;->a(Lck4;I)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    :goto_1
    const/4 v0, 0x1

    .line 97
    if-ne p0, v0, :cond_4

    .line 98
    .line 99
    return v0

    .line 100
    :cond_4
    const/4 p0, 0x0

    .line 101
    return p0
.end method

.method public t()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldw7;

    .line 4
    .line 5
    iget-object v0, v0, Ldw7;->n:Lck4;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, v0, Lck4;->X:Lb6;

    .line 10
    .line 11
    iget-object p0, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Law7;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    iget-object v1, v0, Lb6;->A0:Landroid/view/View;

    .line 20
    .line 21
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    add-int/lit8 p0, p0, -0x2

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of v1, p0, Law7;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    check-cast p0, Law7;

    .line 34
    .line 35
    iget-object p0, p0, Law7;->w:Lzv7;

    .line 36
    .line 37
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lsi3;

    .line 40
    .line 41
    iget-object p0, p0, Lsi3;->h0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    instance-of v1, p0, Lyv7;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    check-cast p0, Lyv7;

    .line 53
    .line 54
    iget-object p0, p0, Lyv7;->v:Lf63;

    .line 55
    .line 56
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lc6;

    .line 59
    .line 60
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object p0, v0, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    :goto_0
    const/4 v0, 0x1

    .line 76
    if-ne p0, v0, :cond_2

    .line 77
    .line 78
    return v0

    .line 79
    :cond_2
    const/4 p0, 0x0

    .line 80
    return p0
.end method

.method public u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxa2;

    .line 4
    .line 5
    if-eqz p2, :cond_9

    .line 6
    .line 7
    if-eqz p3, :cond_9

    .line 8
    .line 9
    invoke-virtual {p0}, Lxa2;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lxa2;->c:Luc2;

    .line 13
    .line 14
    iget-object v1, v0, Luc2;->h:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Lxa2;->a()V

    .line 17
    .line 18
    .line 19
    iget-object p0, v0, Luc2;->a:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v1, :cond_8

    .line 22
    .line 23
    new-instance v0, Ljava/net/URL;

    .line 24
    .line 25
    const-string v2, "/registrations/"

    .line 26
    .line 27
    const-string v3, "/topicSubscriptions/"

    .line 28
    .line 29
    const-string v4, "https://fcmregistrations.googleapis.com/v1/projects/"

    .line 30
    .line 31
    invoke-static {v4, v1, v2, p3, v3}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    const-string v1, ":"

    .line 36
    .line 37
    invoke-static {p3, p1, v1, p4}, Lp61;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string p1, "FirebaseMessaging"

    .line 45
    .line 46
    const/4 p3, 0x3

    .line 47
    invoke-static {p1, p3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 61
    .line 62
    const-string p3, "POST"

    .line 63
    .line 64
    invoke-virtual {p1, p3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string p3, "x-goog-api-key"

    .line 68
    .line 69
    invoke-virtual {p1, p3, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string p0, "x-goog-firebase-installations-auth"

    .line 73
    .line 74
    invoke-virtual {p1, p0, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    invoke-virtual {p1, p0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 79
    .line 80
    .line 81
    :try_start_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    :try_start_1
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-eqz p3, :cond_1

    .line 94
    .line 95
    invoke-virtual {p3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 96
    .line 97
    .line 98
    :catch_0
    :cond_1
    :try_start_2
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    if-eqz p3, :cond_2

    .line 103
    .line 104
    invoke-virtual {p3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 105
    .line 106
    .line 107
    :catch_1
    :cond_2
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 108
    .line 109
    .line 110
    const/16 p1, 0xc8

    .line 111
    .line 112
    if-lt p0, p1, :cond_3

    .line 113
    .line 114
    const/16 p1, 0x12c

    .line 115
    .line 116
    if-ge p0, p1, :cond_3

    .line 117
    .line 118
    return-void

    .line 119
    :cond_3
    const/16 p1, 0x194

    .line 120
    .line 121
    const-string p3, "Topic "

    .line 122
    .line 123
    if-eq p0, p1, :cond_5

    .line 124
    .line 125
    const/16 p1, 0x193

    .line 126
    .line 127
    if-eq p0, p1, :cond_5

    .line 128
    .line 129
    const/16 p1, 0x1f4

    .line 130
    .line 131
    if-lt p0, p1, :cond_4

    .line 132
    .line 133
    const-string p0, "INTERNAL_SERVER_ERROR"

    .line 134
    .line 135
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 140
    .line 141
    new-instance p2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string p3, " failed with status: "

    .line 150
    .line 151
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_5
    const-string p0, " failed: "

    .line 166
    .line 167
    invoke-static {p3, p4, p0, p2}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :catchall_0
    move-exception p0

    .line 176
    goto :goto_0

    .line 177
    :catch_2
    move-exception p0

    .line 178
    :try_start_3
    new-instance p2, Ljava/io/IOException;

    .line 179
    .line 180
    const-string p3, "SERVICE_NOT_AVAILABLE"

    .line 181
    .line 182
    invoke-direct {p2, p3, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    :goto_0
    :try_start_4
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    if-eqz p2, :cond_6

    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 193
    .line 194
    .line 195
    :catch_3
    :cond_6
    :try_start_5
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    if-eqz p2, :cond_7

    .line 200
    .line 201
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 202
    .line 203
    .line 204
    :catch_4
    :cond_7
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 205
    .line 206
    .line 207
    throw p0

    .line 208
    :cond_8
    const-string p0, "Project ID or API Key is missing"

    .line 209
    .line 210
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_9
    const-string p0, "FIS auth token or FIS ID is empty"

    .line 215
    .line 216
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-void
.end method

.method public v()V
    .locals 0

    .line 1
    iget-object p0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w(Liy;)V
    .locals 7

    .line 1
    new-instance v0, Lem7;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lem7;-><init>(B)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lwe8;

    .line 11
    .line 12
    iget-object v2, p0, Lzv7;->X:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lqz;

    .line 15
    .line 16
    iget-object p0, p0, Lzv7;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ly02;

    .line 19
    .line 20
    iget-object v3, v1, Lwe8;->c:Lof1;

    .line 21
    .line 22
    invoke-static {}, Lqz;->a()Llr;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, v2, Lqz;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Llr;->z(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v5, Lfu5;->X:Lfu5;

    .line 32
    .line 33
    iput-object v5, v4, Llr;->f0:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v2, v2, Lqz;->b:[B

    .line 36
    .line 37
    iput-object v2, v4, Llr;->Z:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v4}, Llr;->e()Lqz;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v4, Lfu6;

    .line 44
    .line 45
    const/4 v5, 0x4

    .line 46
    invoke-direct {v4, v5}, Lfu6;-><init>(B)V

    .line 47
    .line 48
    .line 49
    new-instance v5, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v5, v4, Lfu6;->i0:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v5, v1, Lwe8;->a:Lf08;

    .line 57
    .line 58
    invoke-virtual {v5}, Lf08;->j()J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    iput-object v5, v4, Lfu6;->g0:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v1, v1, Lwe8;->b:Lf08;

    .line 69
    .line 70
    invoke-virtual {v1}, Lf08;->j()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, v4, Lfu6;->h0:Ljava/lang/Object;

    .line 79
    .line 80
    const-string v1, "FCM_CLIENT_EVENT_LOGGING"

    .line 81
    .line 82
    iput-object v1, v4, Lfu6;->Y:Ljava/lang/Object;

    .line 83
    .line 84
    new-instance v1, Ls02;

    .line 85
    .line 86
    iget-object p1, p1, Liy;->a:Lwu4;

    .line 87
    .line 88
    sget-object v5, Le06;->a:Lzz2;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 96
    .line 97
    .line 98
    :try_start_0
    invoke-virtual {v5, p1, v6}, Lzz2;->X(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    .line 100
    .line 101
    :catch_0
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {v1, p0, p1}, Ls02;-><init>(Ly02;[B)V

    .line 106
    .line 107
    .line 108
    iput-object v1, v4, Lfu6;->f0:Ljava/lang/Object;

    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    iput-object p0, v4, Lfu6;->Z:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-virtual {v4}, Lfu6;->v()Ljy;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    iget-object p1, v3, Lof1;->b:Ljava/util/concurrent/Executor;

    .line 118
    .line 119
    new-instance v1, Lj0;

    .line 120
    .line 121
    invoke-direct {v1, v3, v2, v0, p0}, Lj0;-><init>(Lof1;Lqz;Lem7;Ljy;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method
