.class public abstract enum Lai8;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final enum X:Lyh8;

.field public static final enum Y:Lwh8;

.field public static final enum Z:Lzh8;

.field public static final enum f0:Lxh8;

.field public static final synthetic g0:[Lai8;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lyh8;

    .line 2
    .line 3
    invoke-direct {v0}, Lyh8;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lai8;->X:Lyh8;

    .line 7
    .line 8
    new-instance v1, Lwh8;

    .line 9
    .line 10
    invoke-direct {v1}, Lwh8;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lai8;->Y:Lwh8;

    .line 14
    .line 15
    new-instance v2, Lzh8;

    .line 16
    .line 17
    invoke-direct {v2}, Lzh8;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v2, Lai8;->Z:Lzh8;

    .line 21
    .line 22
    new-instance v3, Lxh8;

    .line 23
    .line 24
    invoke-direct {v3}, Lxh8;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v3, Lai8;->f0:Lxh8;

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    new-array v4, v4, [Lai8;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    aput-object v0, v4, v5

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aput-object v1, v4, v0

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    aput-object v2, v4, v0

    .line 40
    .line 41
    const/4 v0, 0x3

    .line 42
    aput-object v3, v4, v0

    .line 43
    .line 44
    sput-object v4, Lai8;->g0:[Lai8;

    .line 45
    .line 46
    return-void
.end method

.method public static b(Lmo8;)Lai8;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt14;->o0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lai8;->Y:Lwh8;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v0, Llh4;->E0:Llh4;

    .line 14
    .line 15
    invoke-virtual {v0}, Llh4;->S0()Ljh8;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0}, Lyn0;->O(Lt14;)Laa7;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object v1, Lih8;->b:Lih8;

    .line 24
    .line 25
    invoke-static {v0, p0, v1}, Lz68;->R(Ljh8;Lzk6;Ldt7;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    sget-object p0, Lai8;->f0:Lxh8;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    sget-object p0, Lai8;->Z:Lzh8;

    .line 35
    .line 36
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lai8;
    .locals 1

    .line 1
    const-class v0, Lai8;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lai8;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lai8;
    .locals 1

    .line 1
    sget-object v0, Lai8;->g0:[Lai8;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lai8;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a(Lmo8;)Lai8;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lai8;->b(Lmo8;)Lai8;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method
