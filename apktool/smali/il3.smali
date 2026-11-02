.class public final Lil3;
.super Ltj3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic g:[Lnw3;


# instance fields
.field public final f:Lte4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Lil3;

    .line 4
    .line 5
    const-string v2, "allValueArguments"

    .line 6
    .line 7
    const-string v3, "getAllValueArguments()Ljava/util/Map;"

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
    sput-object v1, Lil3;->g:[Lnw3;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lja6;Lz47;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ltg7;->t:Lfk2;

    .line 5
    .line 6
    invoke-direct {p0, p2, p1, v0}, Ltj3;-><init>(Lz47;Lja6;Lfk2;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p2, Lz47;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lc6;

    .line 12
    .line 13
    iget-object p1, p1, Lc6;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lve4;

    .line 16
    .line 17
    new-instance p2, Lzk3;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-direct {p2, p0, v0}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lte4;

    .line 24
    .line 25
    invoke-direct {v0, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lil3;->f:Lte4;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final e()Ljava/util/Map;
    .locals 2

    .line 1
    sget-object v0, Lil3;->g:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lil3;->f:Lte4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Map;

    .line 13
    .line 14
    return-object p0
.end method
