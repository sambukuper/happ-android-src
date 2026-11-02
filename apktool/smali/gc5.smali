.class public final Lgc5;
.super Lld2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final d:Lgc5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lgc5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, Lld2;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lgc5;->d:Lgc5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Lxr0;Lrs;Lbc7;Lp91;Lvc5;)V
    .locals 0

    .line 1
    iget p0, p3, Lbc7;->t:I

    .line 2
    .line 3
    new-instance p1, Lb1;

    .line 4
    .line 5
    const/4 p2, 0x5

    .line 6
    invoke-direct {p1, p4, p2}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p0, p1}, Lbc7;->m(ILrn2;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3}, Lbc7;->G()Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
