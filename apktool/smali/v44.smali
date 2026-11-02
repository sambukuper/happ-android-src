.class public final Lv44;
.super Luf5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic q0:[Lnw3;


# instance fields
.field public final k0:Ldb6;

.field public final l0:Lz47;

.field public final m0:Lte4;

.field public final n0:Ltt3;

.field public final o0:Lne4;

.field public final p0:Lsm;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Lv44;

    .line 4
    .line 5
    const-string v2, "binaryClasses"

    .line 6
    .line 7
    const-string v3, "getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm()Ljava/util/Map;"

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
    sput-object v1, Lv44;->q0:[Lnw3;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lz47;Ldb6;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lz47;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc6;

    .line 4
    .line 5
    iget-object v1, v0, Lc6;->n0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lwx4;

    .line 8
    .line 9
    iget-object v2, p2, Ldb6;->a:Lfk2;

    .line 10
    .line 11
    invoke-direct {p0, v1, v2}, Luf5;-><init>(Lvx4;Lfk2;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lv44;->k0:Ldb6;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x6

    .line 18
    invoke-static {p1, p0, v1, v2}, Lpu;->k(Lz47;Lbt0;Lta6;I)Lz47;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lv44;->l0:Lz47;

    .line 23
    .line 24
    iget-object v0, v0, Lc6;->j0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lzl1;

    .line 27
    .line 28
    invoke-virtual {v0}, Lzl1;->c()Lhl1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, Lhl1;->c:Lpz2;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v0, Lhv4;->g:Lhv4;

    .line 38
    .line 39
    iget-object v0, p1, Lz47;->Y:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lc6;

    .line 42
    .line 43
    iget-object v1, v0, Lc6;->f0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lve4;

    .line 46
    .line 47
    new-instance v2, Lu44;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-direct {v2, p0, v3}, Lu44;-><init>(Lv44;B)V

    .line 51
    .line 52
    .line 53
    new-instance v3, Lte4;

    .line 54
    .line 55
    invoke-direct {v3, v1, v2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 56
    .line 57
    .line 58
    iput-object v3, p0, Lv44;->m0:Lte4;

    .line 59
    .line 60
    new-instance v2, Ltt3;

    .line 61
    .line 62
    invoke-direct {v2, p1, p2, p0}, Ltt3;-><init>(Lz47;Ldb6;Lv44;)V

    .line 63
    .line 64
    .line 65
    iput-object v2, p0, Lv44;->n0:Ltt3;

    .line 66
    .line 67
    new-instance v2, Lu44;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-direct {v2, p0, v3}, Lu44;-><init>(Lv44;B)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lne4;

    .line 74
    .line 75
    invoke-direct {v3, v1, v2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 76
    .line 77
    .line 78
    iput-object v3, p0, Lv44;->o0:Lne4;

    .line 79
    .line 80
    iget-object v0, v0, Lc6;->g0:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lo8;

    .line 83
    .line 84
    iget-boolean v0, v0, Lo8;->Y:Z

    .line 85
    .line 86
    if-eqz v0, :cond_0

    .line 87
    .line 88
    sget-object p1, Loy1;->f0:Lrm;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-static {p1, p2}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_0
    iput-object p1, p0, Lv44;->p0:Lsm;

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final K()Let4;
    .locals 0

    .line 1
    iget-object p0, p0, Lv44;->n0:Ltt3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotations()Lsm;
    .locals 0

    .line 1
    iget-object p0, p0, Lv44;->p0:Lsm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Lke7;
    .locals 2

    .line 1
    new-instance v0, Lvk1;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy Java package fragment: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Luf5;->i0:Lfk2;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " of module "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lv44;->l0:Lz47;

    .line 19
    .line 20
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lc6;

    .line 23
    .line 24
    iget-object p0, p0, Lc6;->n0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lwx4;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
