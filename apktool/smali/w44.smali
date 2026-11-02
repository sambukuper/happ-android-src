.class public final Lw44;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lwf5;


# instance fields
.field public final a:Lz47;

.field public final b:Lpe4;


# direct methods
.method public constructor <init>(Lc6;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz47;

    .line 5
    .line 6
    sget-object v1, Llh4;->K0:Llh4;

    .line 7
    .line 8
    new-instance v2, Lqc3;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v3}, Lqc3;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p1, v1, v2}, Lz47;-><init>(Lc6;Lki8;Lg44;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lw44;->a:Lz47;

    .line 18
    .line 19
    iget-object p1, p1, Lc6;->f0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lve4;

    .line 22
    .line 23
    new-instance v0, Lpe4;

    .line 24
    .line 25
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    const/high16 v2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    const/4 v4, 0x3

    .line 31
    invoke-direct {v1, v4, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lve7;

    .line 35
    .line 36
    const/16 v3, 0xf

    .line 37
    .line 38
    invoke-direct {v2, v3}, Lve7;-><init>(B)V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v0, p1, v1, v2, v3}, Lpe4;-><init>(Lve4;Ljava/util/concurrent/ConcurrentHashMap;Lgn2;B)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lw44;->b:Lpe4;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Lfk2;)Z
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

.method public final b(Lfk2;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lw44;->c(Lfk2;)Lv44;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c(Lfk2;)Lv44;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldb6;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ldb6;-><init>(Lfk2;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lc3;

    .line 10
    .line 11
    const/16 v2, 0x19

    .line 12
    .line 13
    invoke-direct {v1, p0, v0, v2}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lre4;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Lre4;-><init>(Ljava/lang/Object;Ldn2;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lw44;->b:Lpe4;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    check-cast p0, Lv44;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    const/4 p0, 0x3

    .line 33
    invoke-static {p0}, Lpe4;->c(I)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method

.method public final t(Lfk2;Lgn2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lw44;->c(Lfk2;)Lv44;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, Lv44;->o0:Lne4;

    .line 9
    .line 10
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/util/List;

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    sget-object p0, Ld02;->X:Ld02;

    .line 19
    .line 20
    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LazyJavaPackageFragmentProvider of module "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lw44;->a:Lz47;

    .line 9
    .line 10
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lc6;

    .line 13
    .line 14
    iget-object p0, p0, Lc6;->n0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lwx4;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
