.class public final Lx66;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lk04;


# static fields
.field public static final j0:Z

.field public static final k0:Ljava/util/HashMap;


# instance fields
.field public X:[I

.field public Y:Ljava/lang/String;

.field public Z:I

.field public f0:[Ljava/lang/String;

.field public g0:[Ljava/lang/String;

.field public h0:[Ljava/lang/String;

.field public i0:La04;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "true"

    .line 2
    .line 3
    const-string v1, "kotlin.ignore.old.metadata"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sput-boolean v0, Lx66;->j0:Z
    :try_end_0
    .catch Ljava/security/AccessControlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    sput-boolean v0, Lx66;->j0:Z

    .line 18
    .line 19
    :goto_0
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lx66;->k0:Ljava/util/HashMap;

    .line 25
    .line 26
    new-instance v1, Lfk2;

    .line 27
    .line 28
    const-string v2, "kotlin.jvm.internal.KotlinClass"

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Ljb5;->S(Lfk2;)Lqs0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, La04;->g0:La04;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    new-instance v1, Lfk2;

    .line 43
    .line 44
    const-string v2, "kotlin.jvm.internal.KotlinFileFacade"

    .line 45
    .line 46
    invoke-direct {v1, v2}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Ljb5;->S(Lfk2;)Lqs0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, La04;->h0:La04;

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    new-instance v1, Lfk2;

    .line 59
    .line 60
    const-string v2, "kotlin.jvm.internal.KotlinMultifileClass"

    .line 61
    .line 62
    invoke-direct {v1, v2}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Ljb5;->S(Lfk2;)Lqs0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v2, La04;->j0:La04;

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    new-instance v1, Lfk2;

    .line 75
    .line 76
    const-string v2, "kotlin.jvm.internal.KotlinMultifileClassPart"

    .line 77
    .line 78
    invoke-direct {v1, v2}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, Ljb5;->S(Lfk2;)Lqs0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v2, La04;->k0:La04;

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    new-instance v1, Lfk2;

    .line 91
    .line 92
    const-string v2, "kotlin.jvm.internal.KotlinSyntheticClass"

    .line 93
    .line 94
    invoke-direct {v1, v2}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Ljb5;->S(Lfk2;)Lqs0;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    sget-object v2, La04;->i0:La04;

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final f(Lqs0;Lga6;)Li04;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lqs0;->a()Lfk2;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Lks3;->a:Lfk2;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    new-instance p1, Ly45;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-boolean p2, Lx66;->j0:Z

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p2, p0, Lx66;->i0:La04;

    .line 25
    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    sget-object p2, Lx66;->k0:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, La04;

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iput-object p1, p0, Lx66;->i0:La04;

    .line 40
    .line 41
    new-instance p1, Llr5;

    .line 42
    .line 43
    const/4 p2, 0x4

    .line 44
    invoke-direct {p1, p0, p2}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method
