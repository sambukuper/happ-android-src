.class public final Lhs;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lms;


# direct methods
.method public constructor <init>(Lms;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhs;->a:Lms;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, Lhs;->a:Lms;

    .line 2
    .line 3
    iget-object v0, p0, Lms;->c:Lm51;

    .line 4
    .line 5
    sget-object v1, Ltp1;->a:Lnf1;

    .line 6
    .line 7
    sget-object v1, Lye1;->Z:Lye1;

    .line 8
    .line 9
    new-instance v2, Lgs;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p1, p0, v3}, Lgs;-><init>(ZLms;Lq51;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x2

    .line 16
    invoke-static {v0, v1, v2, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 17
    .line 18
    .line 19
    return-void
.end method
