.class public final Los3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lls0;


# static fields
.field public static final d:Lk32;

.field public static final synthetic e:[Lnw3;

.field public static final f:Lfk2;

.field public static final g:Lv15;

.field public static final h:Lqs0;


# instance fields
.field public final a:Lwx4;

.field public final b:Lgn2;

.field public final c:Lte4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Los3;

    .line 4
    .line 5
    const-string v2, "cloneable"

    .line 6
    .line 7
    const-string v3, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Lnw3;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, Los3;->e:[Lnw3;

    .line 19
    .line 20
    new-instance v0, Lk32;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Los3;->d:Lk32;

    .line 26
    .line 27
    sget-object v0, Lug7;->k:Lfk2;

    .line 28
    .line 29
    sput-object v0, Los3;->f:Lfk2;

    .line 30
    .line 31
    sget-object v0, Ltg7;->c:Lgk2;

    .line 32
    .line 33
    invoke-virtual {v0}, Lgk2;->g()Lv15;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Los3;->g:Lv15;

    .line 38
    .line 39
    invoke-virtual {v0}, Lgk2;->i()Lfk2;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lqs0;

    .line 44
    .line 45
    invoke-virtual {v0}, Lfk2;->b()Lfk2;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 50
    .line 51
    invoke-virtual {v0}, Lgk2;->g()Lv15;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {v1, v2, v0}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 56
    .line 57
    .line 58
    sput-object v1, Los3;->h:Lqs0;

    .line 59
    .line 60
    return-void
.end method

.method public constructor <init>(Lve4;Lwx4;)V
    .locals 1

    .line 1
    sget-object v0, Lcl1;->o0:Lcl1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Los3;->a:Lwx4;

    .line 7
    .line 8
    iput-object v0, p0, Los3;->b:Lgn2;

    .line 9
    .line 10
    new-instance p2, Lc3;

    .line 11
    .line 12
    const/16 v0, 0x13

    .line 13
    .line 14
    invoke-direct {p2, p0, p1, v0}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lte4;

    .line 18
    .line 19
    invoke-direct {v0, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Los3;->c:Lte4;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Lqs0;)Lsx4;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Los3;->h:Lqs0;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lqs0;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Los3;->e:[Lnw3;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    iget-object p0, p0, Los3;->c:Lte4;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lms0;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final b(Lfk2;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Los3;->f:Lfk2;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Los3;->e:[Lnw3;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    iget-object p0, p0, Los3;->c:Lte4;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lms0;

    .line 24
    .line 25
    invoke-static {p0}, Lw45;->U(Ljava/lang/Object;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/util/Collection;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, Lm02;->X:Lm02;

    .line 33
    .line 34
    return-object p0
.end method

.method public final c(Lfk2;Lv15;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Los3;->g:Lv15;

    .line 8
    .line 9
    invoke-virtual {p2, p0}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    sget-object p0, Los3;->f:Lfk2;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method
