.class public abstract Lxm;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic a:[Lnw3;

.field public static final b:Lr75;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Lxm;

    .line 4
    .line 5
    const-string v2, "annotationsAttribute"

    .line 6
    .line 7
    const-string v3, "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lkotlin/reflect/jvm/internal/impl/types/AnnotationsTypeAttribute;"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-array v1, v4, [Lnw3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v0, v1, v2

    .line 17
    .line 18
    sput-object v1, Lxm;->a:[Lnw3;

    .line 19
    .line 20
    sget-object v0, Lch8;->Y:Lxd6;

    .line 21
    .line 22
    const-class v1, Lwm;

    .line 23
    .line 24
    sget-object v2, Lyb6;->a:Lzb6;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v2, Lr75;

    .line 34
    .line 35
    invoke-interface {v1}, Lzu3;->p()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lxd6;->r(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v1, 0x6

    .line 47
    invoke-direct {v2, v1, v0}, Lr75;-><init>(BI)V

    .line 48
    .line 49
    .line 50
    sput-object v2, Lxm;->b:Lr75;

    .line 51
    .line 52
    return-void
.end method

.method public static final a(Lch8;)Lsm;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lxm;->a:[Lnw3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    sget-object v1, Lxm;->b:Lr75;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p0}, Lr75;->a(Lnw3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lwm;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lwm;->a:Lsm;

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object p0

    .line 25
    :cond_1
    :goto_0
    sget-object p0, Loy1;->f0:Lrm;

    .line 26
    .line 27
    return-object p0
.end method
