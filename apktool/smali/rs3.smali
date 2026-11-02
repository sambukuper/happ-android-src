.class public final Lrs3;
.super Lzz3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic h:[Lnw3;


# instance fields
.field public f:Lps3;

.field public final g:Lte4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Lrs3;

    .line 4
    .line 5
    const-string v2, "customizer"

    .line 6
    .line 7
    const-string v3, "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"

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
    sput-object v1, Lrs3;->h:[Lnw3;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lve4;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lzz3;-><init>(Lve4;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lc3;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, v1}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lte4;

    .line 12
    .line 13
    invoke-direct {v1, p1, v0}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lrs3;->g:Lte4;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final L()Lus3;
    .locals 2

    .line 1
    sget-object v0, Lrs3;->h:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lrs3;->g:Lte4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lus3;

    .line 13
    .line 14
    return-object p0
.end method

.method public final d()Li7;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lrs3;->L()Lus3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final m()Ljava/lang/Iterable;
    .locals 3

    .line 1
    invoke-super {p0}, Lzz3;->m()Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Los3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lzz3;->l()Lwx4;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lzz3;->d:Lve4;

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, Los3;-><init>(Lve4;Lwx4;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lwv0;->G0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final q()Lpo5;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lrs3;->L()Lus3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
