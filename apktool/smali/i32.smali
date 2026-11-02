.class public final Li32;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvx4;


# static fields
.field public static final X:Li32;

.field public static final Y:Lv15;

.field public static final Z:Ld02;

.field public static final f0:Lvz7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li32;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li32;->X:Li32;

    .line 7
    .line 8
    const-string v0, "<Error module>"

    .line 9
    .line 10
    invoke-static {v0}, Lv15;->g(Ljava/lang/String;)Lv15;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Li32;->Y:Lv15;

    .line 15
    .line 16
    sget-object v0, Ld02;->X:Ld02;

    .line 17
    .line 18
    sput-object v0, Li32;->Z:Ld02;

    .line 19
    .line 20
    sget-object v0, Ltz;->m0:Ltz;

    .line 21
    .line 22
    new-instance v1, Lvz7;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Li32;->f0:Lvz7;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final A(Lvx4;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0
.end method

.method public final J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final W(Ljh0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public final a()Led1;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final a0()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Li32;->Z:Ld02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b0(Lfk2;)Ln74;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string p1, "Should not be called!"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final f()Lzz3;
    .locals 0

    .line 1
    sget-object p0, Li32;->f0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzz3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getAnnotations()Lsm;
    .locals 0

    .line 1
    sget-object p0, Loy1;->f0:Lrm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Lv15;
    .locals 0

    .line 1
    sget-object p0, Li32;->Y:Lv15;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()Led1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final t(Lfk2;Lgn2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld02;->X:Ld02;

    .line 5
    .line 6
    return-object p0
.end method
