.class public final Lqj1;
.super Lob6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic g0:[Lnw3;


# instance fields
.field public final X:Lej1;

.field public final Y:I

.field public final Z:Lfw3;

.field public final f0:Ltb6;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Lqj1;

    .line 4
    .line 5
    const-string v2, "descriptor"

    .line 6
    .line 7
    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Llx5;

    .line 14
    .line 15
    const-string v3, "annotations"

    .line 16
    .line 17
    const-string v5, "getAnnotations()Ljava/util/List;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [Lnw3;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, Lqj1;->g0:[Lnw3;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Lej1;ILfw3;Ldn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lob6;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqj1;->X:Lej1;

    .line 5
    .line 6
    iput p2, p0, Lqj1;->Y:I

    .line 7
    .line 8
    iput-object p3, p0, Lqj1;->Z:Lfw3;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p4}, Lzc1;->X(Lld0;Ldn2;)Ltb6;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iput-object p2, p0, Lqj1;->f0:Ltb6;

    .line 16
    .line 17
    new-instance p2, Lpj1;

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    invoke-direct {p2, p0, p3}, Lpj1;-><init>(Lqj1;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Lzc1;->X(Lld0;Ldn2;)Ltb6;

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final B()Lpw3;
    .locals 4

    .line 1
    new-instance v0, Lkk1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqj1;->K()Lzg5;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Lgt8;->c()Lt14;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v2, Lpj1;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, p0, v3}, Lpj1;-><init>(Lqj1;B)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v0, v1, v2, v3}, Lkk1;-><init>(Lt14;Ldn2;Z)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lqj1;->Z:Lfw3;

    .line 25
    .line 26
    sget-object v2, Lfw3;->X:Lfw3;

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    iget-object p0, p0, Lqj1;->X:Lej1;

    .line 32
    .line 33
    invoke-static {p0, v0}, Lmb6;->c0(Lkb6;Lpw3;)Lpw3;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final F()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqj1;->K()Lzg5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lot8;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lot8;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Lel1;->a(Lot8;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final G()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqj1;->K()Lzg5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lot8;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lot8;

    .line 10
    .line 11
    iget-object p0, p0, Lot8;->n0:Lt14;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final K()Lzg5;
    .locals 2

    .line 1
    sget-object v0, Lqj1;->g0:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lqj1;->f0:Ltb6;

    .line 7
    .line 8
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, Lzg5;

    .line 16
    .line 17
    return-object p0
.end method

.method public final Q()Ljava/util/List;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f()Lkb6;
    .locals 0

    .line 1
    iget-object p0, p0, Lqj1;->X:Lej1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqj1;->K()Lzg5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lot8;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lot8;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {p0}, Lot8;->J0()Ljd0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljd0;->z()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-virtual {p0}, Lfd1;->getName()Lv15;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-boolean v0, p0, Lv15;->Y:Z

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    :goto_1
    return-object v1

    .line 40
    :cond_3
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public final t()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqj1;->K()Lzg5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lot8;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lot8;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    const/4 v0, 0x0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lot8;->I0()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne p0, v1, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    return v0
.end method

.method public final v()I
    .locals 0

    .line 1
    iget p0, p0, Lqj1;->Y:I

    .line 2
    .line 3
    return p0
.end method

.method public final x()Lfw3;
    .locals 0

    .line 1
    iget-object p0, p0, Lqj1;->Z:Lfw3;

    .line 2
    .line 3
    return-object p0
.end method
