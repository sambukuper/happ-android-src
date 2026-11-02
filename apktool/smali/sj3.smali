.class public final Lsj3;
.super Lob6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final X:Lrj3;

.field public final Y:Ljava/lang/reflect/Method;

.field public final Z:I

.field public final f0:Lg44;


# direct methods
.method public constructor <init>(Lrj3;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lob6;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsj3;->X:Lrj3;

    .line 5
    .line 6
    iput-object p2, p0, Lsj3;->Y:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    iput p3, p0, Lsj3;->Z:I

    .line 9
    .line 10
    new-instance p1, Lf3;

    .line 11
    .line 12
    const/16 p2, 0x1b

    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object p2, Lw74;->X:Lw74;

    .line 18
    .line 19
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lsj3;->f0:Lg44;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final B()Lpw3;
    .locals 0

    .line 1
    iget-object p0, p0, Lsj3;->f0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lpw3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final F()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lsj3;->Y:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final G()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsj3;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lsj3;->Y:Ljava/lang/reflect/Method;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final Q()Ljava/util/List;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f()Lkb6;
    .locals 0

    .line 1
    iget-object p0, p0, Lsj3;->X:Lrj3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lsj3;->Y:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final t()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsj3;->F()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final v()I
    .locals 0

    .line 1
    iget p0, p0, Lsj3;->Z:I

    .line 2
    .line 3
    return p0
.end method

.method public final x()Lfw3;
    .locals 0

    .line 1
    sget-object p0, Lfw3;->f0:Lfw3;

    .line 2
    .line 3
    return-object p0
.end method
