.class public final Lha6;
.super Le0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final d:Lha6;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lha6;

    .line 2
    .line 3
    sget-object v1, Lb24;->g0:Lb24;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Lo8;

    .line 9
    .line 10
    sget-object v3, Lel3;->d:Lfl3;

    .line 11
    .line 12
    iget-object v4, v3, Lfl3;->b:Lb24;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    iget v4, v4, Lb24;->f0:I

    .line 17
    .line 18
    iget v5, v1, Lb24;->f0:I

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    if-gtz v4, :cond_0

    .line 22
    .line 23
    iget-object v3, v3, Lfl3;->c:Lje6;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v3, v3, Lfl3;->a:Lje6;

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v4, Lje6;->Z:Lje6;

    .line 32
    .line 33
    if-ne v3, v4, :cond_1

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v4, v3

    .line 38
    :goto_1
    new-instance v5, Lis3;

    .line 39
    .line 40
    invoke-direct {v5, v3, v4}, Lis3;-><init>(Lje6;Lje6;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Lf0;

    .line 44
    .line 45
    const/16 v4, 0x11

    .line 46
    .line 47
    invoke-direct {v3, v1, v4}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, v5, v3}, Lo8;-><init>(Lis3;Lf0;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v2}, Le0;-><init>(Lo8;)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lha6;->d:Lha6;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)Lfk2;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Lzu3;->p()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    new-instance p1, Lfk2;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ld02;->X:Ld02;

    .line 7
    .line 8
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
