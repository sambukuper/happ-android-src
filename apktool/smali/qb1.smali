.class public final Lqb1;
.super Lm2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lqb1;

.field public static final b:Lg44;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqb1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqb1;->a:Lqb1;

    .line 7
    .line 8
    new-instance v0, Lw01;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lw01;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lw74;->X:Lw74;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lqb1;->b:Lg44;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lqb1;->b:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Luy6;

    .line 8
    .line 9
    invoke-virtual {p0}, Luy6;->d()Le37;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
