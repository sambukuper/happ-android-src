.class public final enum Lg02;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lo85;


# static fields
.field public static final X:Lq85;

.field public static final synthetic Y:[Lg02;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lg02;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    filled-new-array {v0}, [Lg02;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sput-object v1, Lg02;->Y:[Lg02;

    .line 14
    .line 15
    invoke-static {v0}, Lq85;->c(Lo85;)Lq85;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lg02;->X:Lq85;

    .line 20
    .line 21
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg02;
    .locals 1

    .line 1
    const-class v0, Lg02;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lg02;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lg02;
    .locals 1

    .line 1
    sget-object v0, Lg02;->Y:[Lg02;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lg02;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lg02;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Laq7;

    .line 2
    .line 3
    invoke-interface {p1}, Lu85;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
